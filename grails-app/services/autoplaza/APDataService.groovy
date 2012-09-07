package autoplaza

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

class APDataService {

	boolean transactional = true
	def queryParams
	String relativePath
	String baseurlAPI = "http://api.autoplaza.com.mx"
	int status
	def result

	def requestData =
	{
		def http = new HTTPBuilder(baseurlAPI)

		http.request( GET, JSON ) {
			
			uri.path = relativePath
			uri.query = queryParams
			
			// response handler for a success response code:
			response.success = { resp, json ->
//				println resp.statusLine.statusCode
				status =  resp.statusLine.statusCode 
				result = json
			}
			
			// handler for any failure status code:
			response.failure = { resp ->
			  println "Unexpected error: ${resp.statusLine.statusCode} : ${resp.statusLine.reasonPhrase}"
			}
		}
	}
	
	def getSection(query)
	{
		switch ( query ) {
			
			case "homeAP":
				relativePath ="/api/anuncios"
				queryParams = [q:"test"]
				requestData()
				break
			
//			case "homeMELI":
//				baseurlAPI= "https://api.mercadolibre.com"
//				relativePath ="/sites/MLM/search"
//				queryParams = [category:"MLM1744", seller_id:"71922862"]
//				conectar()
//				break
			
			case "navMarca":
				relativePath ="/api/Navegador"
				queryParams = [isNavigator:"yes", NavigatorName:"marca", query:"content;a*", orderby:""]
				requestData()
				break
			
			case "navyear":
				relativePath ="/api/Navegador"
				queryParams = [isNavigator:"yes", NavigatorName:"year", query:"content;a*", orderby:""]
				requestData()
				break
			
			case "navestado":
				relativePath ="/api/Navegador"
				queryParams = [isNavigator:"yes", NavigatorName:"estado", query:"content;a*", orderby:""]
				requestData()
				break
			
			case "navprecio":
				relativePath ="/api/Navegador"
				queryParams = [isNavigator:"yes", NavigatorName:"rankprecio", query:"content;a*", orderby:""]
				requestData()
				break
			
			default:
				result = "query invalido"
		}

		return result
	}
	
	/*
	 * TODO: Revisar y refactorizar
	 */
	/*
	def procesarQueryDetalle(identificador, tipo)
	{
		resultado = ""
		status = 400  // inicializamos la api
		urlApi = "http://api.autoplaza.com.mx"
		if (tipo == "MELI")
		{
			urlApi = "https://api.mercadolibre.com"
			api ="/items/${identificador}"
		}
		
		conectar()
				
		return resultado
	}*/
}
