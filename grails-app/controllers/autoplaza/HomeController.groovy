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
	def NavMarca = []
	def NavPrecio = []
	def NavEstado = []
	def NavYear = []
	def S_Script
	
    def index(String q) {
			
			
		    if (q == "" || q == null)
			{
				q = "homeAP"
			}
		    listadovip(q)  // generamos el listado VIP
			menus()
			publicidad()
			["Anuncios":Anuncios, "NavMarca":NavMarca, "NavPrecio":NavPrecio, "NavEstado":NavEstado,
				 "NavYear":NavYear, "BannersScript":S_Script]
		 }
	
	
	// metodo para generar el listado de los anuncios VIP para la seccion de la home
	def listadovip(String query)
	{
		
		Anuncios.clear
		def APServicio = new APDataService()
		def Dat = APServicio.procesarQuery(query)
		
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
		def APServicio = new APDataService()
		def Dat		
		//navegador marca
		Dat= APServicio.procesarQuery("navmarca")
		if (APServicio.status == 200) // si la conexion tuvo exito
		{			 
			Dat.Resultado.each {

				  navMarca.add(
					  new  ItemNavegador(
						  nombre : it.ItemName,
						  cantidad : it.val,
						  navegador: "Marca",
						  url: "http://www.autos-usados.autoplaza.com.mx/Autos/${it.ItemName}-marca.aspx?query=&isfql=false&filtros="
						  
						  )
					  )
			  }
		}
		//navegador precio
		Dat= APServicio.procesarQuery("navprecio")
		if (APServicio.status == 200) // si la conexion tuvo exito
		{
			  Dat.Resultado.each {
				 
				  navPrecio.add(
					   new  ItemNavegador(
						  nombre : it.ItemName,
						  cantidad : it.val,
						  navegador:"Precio",
						  url: "http://www.autos-usados.autoplaza.com.mx/Autos/${it.ItemName.replaceAll(' ','-')}-rankprecio.aspx?query=&isfql=false&filtros="
						  
						  )
					  )
			  }
				  
		} // end if
		
		//navegador estado
		Dat= APServicio.procesarQuery("navestado")
		if (APServicio.status == 200) // si la conexion tuvo exito
		{
			  Dat.Resultado.each {
				  navEstado.add(
					   new  ItemNavegador(
						  nombre : it.ItemName,
						  cantidad : it.val,
						  navegador: "Estado",
						  url: "http://www.autos-usados.autoplaza.com.mx/Autos/${it.ItemName.replaceAll(' ','-')}-estado.aspx?query=&isfql=false&filtros="
						  
						  )
					  )
				  
			  }
				  
		} // end if
		
		//navegador anio
		Dat= APServicio.procesarQuery("navyear")
		if (APServicio.status == 200) // si la conexion tuvo exito
		{
			  Dat.Resultado.each {
				  navYear.add(
					   new  ItemNavegador(
						  nombre : it.ItemName,
						  cantidad : it.val,
						  navegador : "Año",
						  url: "http://www.autos-usados.autoplaza.com.mx/Autos/${it.ItemName}-year.aspx?query=&isfql=false&filtros="
						  
						  )
					  )
			  }
				  
		} // end if

	}	
	
	// genera los tag's de publicidad para la seccion de la home
	def publicidad()
	{
		
		//S_Script = new S_BannerScriptService()
		//S_Script.Gen_ScriptPBanner()
							
	}																																																																	
		
	
}
