package autoplaza



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Contacto)
class ContactoTests {

    void testSomething() {
       
    }
	void testcreaContacto()
	{
		def contacto = new Contacto(
			contactoID : 125,
			nombre:"David Paz",
			email:"davidpaz@autoplaza.com.mx",
			tipoTelefono:"celular",
			lada:"044-55",
			telefono:"2857-4348",
			estado:"Distrito Federal"
			 )
		assertEquals "David Paz",contacto.nombre
	}
}
