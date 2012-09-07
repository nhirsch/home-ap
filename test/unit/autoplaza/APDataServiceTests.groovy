package autoplaza

import org.apache.http.HttpStatus;

//import grails.test.mixin.*
//import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(APDataService)
class APDataServiceTests {

	void testValidateCreatedService()
	{
		def APService = new APDataService()
		assertEquals "http://api.autoplaza.com.mx", APService.baseurlAPI

	}

	void testServiceWasCreatedAndStatusIsOK()
	{
		def APServicio = new APDataService()
		def Dat = APServicio.getSection("homeAP")
		assertEquals HttpStatus.SC_OK, APServicio.status
	}


	/* Test para consultar información del menu de marca desde la la api de autoplaza */

	void testGetDataNavMarca()
	{
//		def APServicio = new APDataService()
//		def Dat = APServicio.getSection("navmarca")
//		assertEquals HttpStatus.SC_OK, APServicio.status  // si la conexion tuvo exito
	}
}
