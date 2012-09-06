package autoplaza

//import grails.test.mixin.*
//import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(HomeTagLib)
class HomeTagLibTests {

    void testHeader() {
        def template = '<ap:header />'
        def content = applyTemplate(template)
        assertTrue(content.contains("<a href='#' class='nuevos'>Nuevos</a>"))
    }
}
