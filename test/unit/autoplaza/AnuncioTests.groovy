package autoplaza

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Anuncio)
class AnuncioTests {

    void testCreaAnuncio() {
        def AnuncioVIP = new Anuncio(
                identificador: "A123456",
                marca: "Volkswagen",
                modelo: "Jetta",
                urlFotoPrincipal: "http://autoplaza.blob.core.windows.net/autos-usados-a21142260/BMW-Serie%203-2001%20%5BA21142260%5D-ida21142260-100-90aaea38-d0af-42a6-8688-ab13b3c2e9d4.jpg",
                Estado: "Aguascalientes",
                precio: "125000.00",
                tipoMoneda: "MXN"
        )
        assertEquals "A123456", AnuncioVIP.identificador
    }
}
