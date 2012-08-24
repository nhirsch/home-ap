package autoplaza



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(APDataService)
class APDataServiceTests {

	void testSomething() {
	
	}
   
 /* Test para consultar información de los listados de anuncios vip desde la la api de autoplaza*/
	
 void getDataAP()
 {
	
	 def APServicio = new APDataService(
		 queryProcesado:"",
		 api:"",
		 urlApi:"http://api.autoplaza.com.mx",
		 status:400,
		 resultado:""
		 )
	 def Dat = APServicio.procesarQuery("homeAP")
	 assertEquals "http://api.autoplaza.com.mx", APServicio.urlApi  // si la conexion tuvo exito

 }
 
 /* Test para consultar información de los listados de anuncios vip desde la la api de MELI */
 
 void getDataMELI()
 {
	  def APServicio = new APDataService()
	 def Dat = APServicio.procesarQuery("homeMELI")
	 assertEquals 200, APServicio.status  // si la conexion tuvo exito
 }
 
 
 /* Test para consultar información del menu de marca desde la la api de autoplaza */
 
 void getDataNavMarca()
 {
	  def APServicio = new APDataService()
	 def Dat = APServicio.procesarQuery("navmarca")
	 assertEquals 200, APServicio.status  // si la conexion tuvo exito
 }
 
}
