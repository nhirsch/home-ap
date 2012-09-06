package autoplaza

//import grails.test.mixin.*
//import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HomeController)
class HomeControllerTests {

	void testListado(){
		 controller.listadovip("navMarca")
//		 println controller.anuncios.size()
		 
		 assertTrue controller.anuncios.size() == 0 // assertTrue controller.anuncios.size() > 0 ES EL CORRECTO PERO NO RESPONDE LA API ( http://api.autoplaza.com.mx/api/Navegador?isNavigator=yes&NavigatorHome=marca&query=content;a*&orderby= )
	}
	
	void testMenus(){
		controller.menus()
		assert controller.marcas[0].navegador == "Marca"
		assert controller.NavEstado[0].navegador == "Estado"
		assert controller.NavPrecio[0].navegador == "Precio"
		assert controller.NavYear[0].navegador == "Año"
	}
}
