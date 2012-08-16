package autoplaza


class HomeController {
	
	
    def index() {
		
		// lisatdo del home
		def Listado = new ListadoHome()
		Listado.generaListado("home")
		// navegador de marca
		Navegador marca = new Navegador()
		marca.generaNavegador("marca")
		// navegador de año
		Navegador anio = new Navegador()
		anio.generaNavegador("year")
		// navegador de estado
		Navegador estado = new Navegador()
		estado.generaNavegador("estado")
		// navegador de precio
		Navegador precio = new Navegador()
		precio.generaNavegador("precio")
		
		["Listado":Listado, "navMarca":marca, "navAnio":anio, "navEstado":estado, "navPrecio":precio]
		
		
		 }
	
																																																																		
	def pruebasListado()																																						
	{
	
		// esto solo es pruebas
		
		def Listado = new ListadoHome()
		Listado.generaListado("home")
		
		if (Listado.Anuncios.size() >0)
		{
		render "Hola este es el controlador sincronizandooo....<br>"
		 render "<br>LA info desde los objetos<br>"
		 render "<br>la longitud de la lista de anuncios es --  ${Listado.Anuncios.size()}<br>"
		 for (int j = 0; j<Listado.Anuncios.size(); j++)
		 {
		   if ((j)%4 == 0)
		   {
			   render "----- <b>Aqui comienza un renglon </b>"
		   }
			 
		   render "<br>-${Listado.Anuncios[j].anuncioid}"
		   render "<br>-${Listado.Anuncios[j].marca}"
		   render "<br>-${Listado.Anuncios[j].modelo}"
		   render "<br>-${Listado.Anuncios[j].precio}"
		   render "<br>-${Listado.Anuncios[j].Estado}"
		   render "<br>-${Listado.Anuncios[j].anio}"
		   render "<br>"
		 }
		 
		 render "<br>Fin de la lista..."
		}
		else
		{
			render "${Listado.error}"
			
			
		
		}
		

	}
	
	def pruebasNavegador(String q)
	{
		// esto solo es pruebas
		
		Navegador nav = new Navegador()
		nav.generaNavegador(q)
		
		render  "<br>El navegador es : ${nav.nombre}<br>"
		
		for (int j = 0; j<nav.items.size(); j++)
		{
		  render "-${nav.items[j].itemNombre}"
		  render "-${nav.items[j].cantidad}"
		  render "-${nav.items[j].link}"
		  render "<br>"
		}

	}
}
