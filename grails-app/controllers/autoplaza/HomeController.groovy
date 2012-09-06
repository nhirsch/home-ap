package autoplaza

import autoplaza.APDataService
import org.apache.http.HttpStatus;

class HomeController {

	def anuncios = []
	def marcas = []
	def NavPrecio = []
	def NavEstado = []
	def NavYear = []
	def S_Script
	def dataService = new APDataService()
	def data

	def index(String q) {
		
		if (q == "" || q == null) {
			q = "homeAP"
		}

		listadovip(q)  // generamos el listado VIP

		menus()

		publicidad()

		[
			"Anuncios":anuncios,
			"NavMarca":marcas,
			"NavPrecio":NavPrecio,
			"NavEstado":NavEstado,
			"NavYear":NavYear,
			"BannersScript":S_Script
		]
	}

	// metodo para generar el listado de los anuncios VIP para la seccion de la home
	def listadovip(String query)
	{
		anuncios.clear
		data = dataService.getSection(query)

		if (dataService.status == HttpStatus.SC_OK) // si la conexion tuvo exito
		{
			data.results.each {

				anuncios.add(
					new  Anuncio(
						tipoMoneda : it.currency_id,
						marca: it.attributes.value_name[1],
						modelo:it.attributes.value_name[2],
						urlFotoPrincipal:it.thumbnail,
						anio:it.attributes.value_name[4],
						precio:it.price,
						estado:it.address.state_name
					)
				)
			}
		} // end if
	}

	// metodo para generar los menus (navegadores: marca, precio, estado y año) para la seccion de la home
	def menus()
	{
		String baseUrl = "http://www.autos-usados.autoplaza.com.mx/Autos/"
		String urlPath
		
		//navegador marca
		data = dataService.getSection("navMarca")
		if (dataService.status == HttpStatus.SC_OK) // si la conexion tuvo exito
		{
			data.Resultado.each {

				marcas.add(
					new  ItemNavegador(
						nombre : it.ItemName,
						cantidad : it.val,
						navegador: "Marca",
						urlPath: baseUrl + "${it.ItemName}-marca.aspx?query=&isfql=false&filtros="
					)
				)
			}
		}

		//navegador precio
		data = dataService.getSection("navprecio")
		if (dataService.status == HttpStatus.SC_OK) // si la conexion tuvo exito
		{
			data.Resultado.each {

				navPrecio.add(
					new  ItemNavegador(
						nombre : it.ItemName,
						cantidad : it.val,
						navegador:"Precio",
						urlPath: baseUrl + "${it.ItemName.replaceAll(' ','-')}-rankprecio.aspx?query=&isfql=false&filtros="
					)
				)
			}
		} // end if

		//navegador estado
		data = dataService.getSection("navestado")
		if (dataService.status == HttpStatus.SC_OK) // si la conexion tuvo exito
		{
			data.Resultado.each {
				navEstado.add(
					new  ItemNavegador(
						nombre : it.ItemName,
						cantidad : it.val,
						navegador: "Estado",
						urlPath: baseUrl + "${it.ItemName.replaceAll(' ','-')}-estado.aspx?query=&isfql=false&filtros="
					)
				)
			}
		} // end if

		//navegador anio
		data = dataService.getSection("navyear")
		if (dataService.status == HttpStatus.SC_OK) // si la conexion tuvo exito
		{
			data.Resultado.each {
				navYear.add(
					new  ItemNavegador(
					nombre : it.ItemName,
					cantidad : it.val,
					navegador : "Año",
					urlPath: baseUrl + "${it.ItemName}-year.aspx?query=&isfql=false&filtros="
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
