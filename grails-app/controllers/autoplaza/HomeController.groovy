package autoplaza



class HomeController {
	
	def Anuncios = []
	
    def index() {
			
			listadovip()  // generamos el listado VIP
			["Anuncios":Anuncios]
		 }
	
	
	// metodo para generar el listado de los anuncios VIP para la seccion de la home
	def listadovip()
	{
		
		def APSErvicio = new APDataService()
		def Dat = APSErvicio.procesarQuery("home")
		
		if (Dat != "No tenemos resultados") // solo para prueba revisar 
		{
		
			def seqArray = Dat
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
							 marca:"${object[3]}",
							 modelo:"${object[0]}",
							 urlFotoPrincipal:"${object[10]}",
							 anio:"${object[2]}",
							 precio:"${object[5]}",
							 Estado:"${object[9]}"
							 
							 )
						
						Anuncios.add(Item)
					 }
				 
			
				   } // end each
			
			} // end split
			
		} // end if
		
		
	}
	
	// metodo para generar los menus (navegadores: marca, precio, estado y año) para la seccion de la home
	def menus()
	{
        
	}	
	
	// genera los tag's de publicidad para la seccion de la home
	def publicidad()
	{
		
	}																																																																	
	
	
}
