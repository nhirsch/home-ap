package autoplaza

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.2' )
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.TEXT



class DataSource {
	int sourceID
	String query
	String queryProcesado
	String resultado
	int statusConexion
	
    static constraints = {
		query(blank:false)
		sourceID(min:0)
    }
	
	def conectar  =
	{
		
			if (sourceID == 1)  // para elegir la fuente de donde se tomaran los datos
			{
				String url = "http://iphone.autoplaza.com.mx/fastSearch/fastSearchIphone.aspx?"+queryProcesado
				
				def http = new HTTPBuilder(url)
				
					 http.request( GET, TEXT ) { req ->
				
						 // executed for all successful responses:
						 response.success = { resp, reader ->
							 //render "my response handler!"
							 assert resp.statusLine.statusCode == 200
							 statusConexion = 200
							 resultado =  reader.text // print response stream
				   
						 }
				  
						 // executed only if the response status code is 401:
						 response.'404' = { resp ->
							 //render  "not found!"
							 statusConexion == 404
							 resultado = "No tenemos resultados"
						 }
					 }
			}
			else
			{
				resultado = "fuente de datos no existe"
			}
		
		
	}
	def procesarQuery()
	{
		
		if (sourceID == 1) // elegimos la fuente para procesar los querys a los llamados
		{
			
		
			switch ( query ) {
				case "home":
					queryProcesado = "HP=yes"
					conectar()
					break
					// lets fall through
		
				case "navmarca":
					queryProcesado = "isnavigator=yes&navigatorname=marca&query="
					conectar()
					break
				case "navyear":
					queryProcesado = "isnavigator=yes&navigatorname=year&query="
					conectar()
					break
				case "navestado":
					queryProcesado = "isnavigator=yes&navigatorname=estado&query="
					conectar()
					break
				case "navprecio":
					queryProcesado = "isnavigator=yes&navigatorname=rankprecio&query="
					conectar()
					break
				default:
					resultado = "query invalido"
			}
		}
	}
}
