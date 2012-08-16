 package autoplaza

class ListadoHome {

    int listadoID
	String query
	String error
	def Anuncios = []
	static constraints = {
    }
	
	void limpiaListado()
	{
		Anuncios = []
	}
	
	void addAnuncio (Anuncio item)
	{
		Anuncios.add(item)
	}
	
	void generaListado(String Q)
	{
		def Dat = new DataSource()
		Dat.sourceID = 1  // se refiere a la api de autoplaza aqui se parcea la informacion
		Dat.query = Q
		Dat.procesarQuery()
		
		if (Dat.statusConexion == 200)
		{
		
			def seqArray = Dat.resultado
			int i = 0
			seqArray.splitEachLine("%%%"){
			
			   it.each{ x ->
				   def object = x.split("@@@")
				   if (i == 0)
				   {
					 i=i+1
				   }else
					 {
						 // es anuncio
						 /*render "<br>mas...<br>"
						 render "<br><b>modelo = </b>${object[0]}"
						 render "<br><b>id =</b> ${object[1]}"
						 render "<br><b>año = </b>${object[2]}"
						 render "<br><b>marca =</b> ${object[3]}"
						 render "<br><b>transmision = </b>${object[4]}"
						 render "<br><b>precio =</b> ${object[5]}"
						 render "<br><b>kilometraje = </b>${object[6]}"
						 render "<br><b>color =</b> ${object[7]}"
						 render "<br><b>definir = </b>${object[8]}"
						 render "<br><b>estado =</b> ${object[9]}"
						 render "<br><b>foto = </b>${object[10]}"
						 render "<br><b>tipoanuncioID =</b> ${object[11]}"
						 render "<br><b>version = </b>${object[12]}"
						 */

						 def Item = new  Anuncio(
							 identificador:"${object[1]}",
							 anuncioid:"${object[1]}",
							 marca:"${object[3]}",
							 modelo:"${object[0]}",
							 imagen:"${object[10]}",
							 anio:"${object[2]}",
							 precio:"${object[5]}",
							 Estado:"${object[9]}"
							 
							 )
						
						 addAnuncio(Item)
					 }
				 
			
			   	} // end each
			
			} // end split
		} // end if
		else
		{
			error = Dat.resultado
		}
	}
}
