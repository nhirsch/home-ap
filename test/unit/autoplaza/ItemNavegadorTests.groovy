package autoplaza

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ItemNavegador)
class ItemNavegadorTests {

    void testCreaNavegador() {
        def NavMarca = new ItemNavegador(
                nombre: "Volkswagen",
                cantidad: 1520,
                url: "http://www.autoplaza.com"
        )
        assertEquals 1520, NavMarca.cantidad
    }
}
