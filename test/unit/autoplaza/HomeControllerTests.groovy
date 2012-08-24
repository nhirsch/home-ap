package autoplaza



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HomeController)
class HomeControllerTests {

    void testSomething() {
       
    }
	
	void testListado(){
		 controller.listadovip()
		 assert controller.Anuncios.size() > 0
	}
	
	void testMenus(){
		controller.menus()
		assert controller.NavMarca[0].navegador == "Marca"
		assert controller.NavEstado[0].navegador == "Estado"
		assert controller.NavPrecio[0].navegador == "Precio"
		assert controller.NavYear[0].navegador == "Año"
	}
}
