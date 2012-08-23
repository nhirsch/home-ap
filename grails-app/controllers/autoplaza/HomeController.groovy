package autoplaza

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.2' )
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.TEXT
import static groovyx.net.http.ContentType.JSON
import groovyx.net.http.RESTClient
import groovyx.net.http.AsyncHTTPBuilder


class HomeController {
	
	def Anuncios = []
	
    def index() {
			
			listadovip()  // generamos el listado VIP
			["Anuncios":Anuncios]
		 }
	
	
	// metodo para generar el listado de los anuncios VIP para la seccion de la home
	def listadovip()
	{
		
		Anuncios.clear
		def APServicio = new APDataService()
		def Dat = APServicio.procesarQuery("homeAP")
		
		if (APServicio.status == 200) // si la conexion tuvo exito
		{
			
			  Dat.results.each {
				  
				  Anuncios.add(
					  new  Anuncio(
						  identificador : it.id,
						  tipoMoneda : it.currency_id,
						  marca: it.attributes.value_name[1],
						  modelo:it.attributes.value_name[2],
						  urlFotoPrincipal:it.thumbnail,
						  anio:it.attributes.value_name[4],
						  precio:it.price,
						  Estado:it.address.state_name
						  
						  )
					  )
				  
			  }
				  
		} // end if
		
		
	}
	
	// metodo para generar los menus (navegadores: marca, precio, estado y año) para la seccion de la home
	def menus()
	{
	

	}	
	
	// genera los tag's de publicidad para la seccion de la home
	def publicidad()
	{
		
	}																																																																	
		
	
}
