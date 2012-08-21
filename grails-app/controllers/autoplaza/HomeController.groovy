package autoplaza

class HomeController {

    def Anuncios = []

    def index() {

        listadovip()  // generamos el listado VIP
        ["Anuncios": Anuncios]
    }

    // metodo para generar el listado de los anuncios VIP para la seccion de la home
    def listadovip() {

        def APServicio = new APDataService()
        def Dat = APServicio.procesarQuery("home")

        if (Dat != "No tenemos resultados") // solo para prueba revisar
        {

            def seqArray = Dat
            int i = 0
            seqArray.splitEachLine("%%%") {

                it.each { x ->
                    def unAnuncio = x.split("@@@")
                    if (i == 0) {
                        i = i + 1
                    } else {
                        def Item = new Anuncio(
                                identificador: "${unAnuncio[1]}",
                                marca: "${unAnuncio[3]}",
                                modelo: "${unAnuncio[0]}",
                                urlFotoPrincipal: "${unAnuncio[10]}",
                                anio: "${unAnuncio[2]}",
                                precio: "${unAnuncio[5]}",
                                Estado: "${unAnuncio[9]}"

                        )

                        Anuncios.add(Item)
                    }


                } // end each

            } // end split

        } // end if


    }

    // metodo para generar los menus (navegadores: marca, precio, estado y año) para la seccion de la home
    def menus() {

    }

    // genera los tag's de publicidad para la seccion de la home
    def publicidad() {

    }


}
