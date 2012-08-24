package autoplaza

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.2' )
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.TEXT
import static groovyx.net.http.ContentType.JSON
import groovyx.net.http.RESTClient
import groovyx.net.http.AsyncHTTPBuilder

class APDataService {

	boolean transactional = true
	def queryProcesado
	String api
	String urlApi = "http://api.autoplaza.com.mx"
	int status
	def resultado 
	
	static constraints = {
		
		
	}

	def conectar  =
	{

		def http = new HTTPBuilder()
		
			 
				http.request( urlApi, GET, JSON ) {
				 uri.path = api
				 uri.query = queryProcesado
				 
				 	response.success = { resp, json ->
						 	status = 200  // respondio bien la conexion
							resultado = json 
						  }
				   
				}
	  
		
	}
	def procesarQuery(query)
	{
		resultado = ""
		status = 400  // inicializamos la api
		urlApi = "http://api.autoplaza.com.mx"
			switch ( query ) {
				case "homeAP":
					api ="/api/anuncios"
					queryProcesado = [q:"test"]
					conectar()
					break
					// lets fall through
				case "homeMELI":
					urlApi = "https://api.mercadolibre.com"
					api ="/sites/MLM/search"
					queryProcesado = [category:"MLM1744", seller_id:"71922862"]
					conectar()
					break
					// lets fall through
				case "navmarca":
					api ="/api/Navegador"
					queryProcesado = [isNavigator:"yes", NavigatorName:"marca", query:"content;a*", orderby:""]
					conectar()
					break
				case "navyear":
					api ="/api/Navegador"
					queryProcesado = [isNavigator:"yes", NavigatorName:"year", query:"content;a*", orderby:""]
					conectar()
					break
				case "navestado":
					api ="/api/Navegador"
					queryProcesado = [isNavigator:"yes", NavigatorName:"estado", query:"content;a*", orderby:""]
					conectar()
					break
				case "navprecio":
					api ="/api/Navegador"
					queryProcesado = [isNavigator:"yes", NavigatorName:"rankprecio", query:"content;a*", orderby:""]
					conectar()
					break
				default:
					resultado = "query invalido"
			}
			
			return resultado
	}
	
}
