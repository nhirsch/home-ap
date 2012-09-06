package autoplaza

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ItemNavegador)
class ItemNavegadorTests {

	void testCreaNavegador()
	{
		def itemMarca = new ItemNavegador(
				nombre:"Volkswagen",
				cantidad:1520,
				url:"http://www.autoplaza.com",
				navegador:"Marca"
				)

		assertEquals "Marca", itemMarca.navegador
	}
	
	void testValidarItemEnNavegador()
	{
		def itemMarca = new ItemNavegador(
			nombre:"Volkswagen",
			cantidad:1520,
			url:"http://www.autoplaza.com",
			navegador:"Marca"
			)

		assertEquals "Marca", itemMarca.navegador
		assertEquals "Volkswagen", itemMarca.nombre
	}
}
