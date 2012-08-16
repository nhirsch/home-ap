package autoplaza

class Navegador {

    String nombre
	def items = []
	
	static constraints = {
    }
	
	void addItem (ItemNavegador item)
	{
		items.add(item)
	}
	
	void generaNavegador(String name)
	{
		nombre = name
		def Dat = new DataSource()
		Dat.sourceID = 1  // se refiere a la api de autoplaza aqui se parcea la infromacion
		Dat.query = "nav"+name
		Dat.procesarQuery()
		String liga
		
		if (Dat.statusConexion == 200)
		{
		
			def seqArray = Dat.resultado
			int i = 0
			seqArray.splitEachLine("%%%"){
			
			   it.each{ x ->
				   def object = x.split("@@@")
				   		String nuevoNombre
						
						switch (Dat.query) {
							
							case "navmarca":
								liga = "http://www.autos-usados.autoplaza.com.mx/Autos/${object[0]}-marca.aspx?query=&isfql=false&filtros="
								break
							case "navyear":
								liga = "http://www.autos-usados.autoplaza.com.mx/Autos/${object[0]}-year.aspx?query=&isfql=false&filtros="
								break
							case "navestado":
							
								nuevoNombre = object[0]
								nuevoNombre = nuevoNombre.replaceAll(' ','-')
								liga = "http://www.autos-usados.autoplaza.com.mx/Autos/${nuevoNombre}-estado.aspx?query=&isfql=false&filtros="
								break
							case "navprecio":
								nuevoNombre = object[0]
								nuevoNombre = nuevoNombre.replaceAll(' ','-')
								//nuevoNombre = nuevoNombre.replaceAll("${signoPesos}",'_')
								liga = "http://www.autos-usados.autoplaza.com.mx/Autos/${nuevoNombre}-rankprecio.aspx?query=&isfql=false&filtros="
								
								break
							default:
								liga = "navegador invalido"
						}
						   
						// creamos el listado
						def Item = new  ItemNavegador(
							 link:"${liga}",
							 itemNombre:"${object[0]}",
							 cantidad:"${object[1]}"
					   
					   )
						 
						 
						 addItem(Item)
						 
				   } // end each
			
			} // end split
		} // end if
		else
		{
			render "${Dat.resultado}"
		}
	}
}
