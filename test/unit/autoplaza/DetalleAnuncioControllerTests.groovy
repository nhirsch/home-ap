package autoplaza



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DetalleAnuncioController)
class DetalleAnuncioControllerTests {

    void testSomething() {
       
    }
	
	void testconsultaDetalle()
	{
		controller.consultaDetalle("MLM406257531")
		assert controller.anuncio.marca == "Seat"
	}
	
	
}
