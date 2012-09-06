package autoplaza

import java.util.Date;

class DetalleAnuncioController {
	def anuncio

    def index(String id) 
	{
		if (id == "" || id == null)
		{
			render "falta el identificador del anuncio..."
		}
		else
		{
			
			consultaDetalle(id)
			
			["Anuncio":anuncio]
		}
	}
	
	def consultaDetalle(String id)
	{
		def APServicio = new APDataService()
		def Dat = APServicio.procesarQueryDetalle(id, "MELI")
		def atributos = []
		
		if (APServicio.status == 200) // si la conexion tuvo exito
		{
			
			atributos = procesaAtributos(Dat)
			
			def seller = new Contacto(
				contactoID : 125,
				nombre:Dat.seller_contact.contact,
				email:Dat.seller_contact.email,
				tipoTelefono:"casa", // este dato no lo maneja meli
				lada:Dat.seller_contact.area_code,
				telefono:Dat.seller_contact.phone,
				estado:Dat.seller_address.state.name
			 )
			 
					
			anuncio = new Anuncio(
						  identificador : Dat.id,
						  tipoMoneda : Dat.currency_id,
						  marca: atributos[1],
						  modelo:atributos[2],
						  kilometraje:atributos[0],
						  urlFotoPrincipal:Dat.thumbnail,
						  versionSub:atributos[3],
						  anio:atributos[4],
						  precio:Dat.price,
						  contacto: seller,
						  fechaRegistro:Dat.start_time,
						  descripcion:Dat.descriptions,
						  equipamiento:Dat.attributes,
						  colorExterior:atributos[5],
						  colorInterior:"sin procesar",
						  tipoVestidura:atributos[7],
						  tipoTransmision:atributos[6]
						  )

		} // end if
	}

	def procesaAtributos(def Dat)	
	{
		def atributos = []
		
		def kilometraje
		def marca
		def modelo
		def submodelo
		def anio
		def colorExt
		def transmision
		def vestidura 
		
		def kilometrajeProcess
		def marcaProcess
		def modeloProcess
		def submodeloProcess
		def anioProcess
		def colorExtProcess
		def transmisionProcess
		def vestiduraProcess

		kilometrajeProcess = marcaProcess = modeloProcess = anioProcess = submodeloProcess = colorExtProcess = transmisionProcess = vestiduraProcess = false
		Dat.attributes.each{
			
			if (!kilometrajeProcess  &&  !marcaProcess  &&  !modeloProcess  &&  !anioProcess && !colorExtProcess && !transmisionProcess && !vestiduraProcess)
			{

				switch ( it.id ) {
					
					case "MLM1744-KMTS":
						kilometraje = it.value_name
						kilometrajeProcess = true
						
						break
					case "MLM1744-MARC":
						marca = it.value_name
						marcaProcess = true
						break
					case "MLM1744-MODL":
						modelo = it.value_name
						modeloProcess = true
						break
					case "MLM1744-VERS":
						submodelo = it.value_name
						submodeloProcess = true
						break
					case "MLM1744-YEAR":
						anio = it.value_name
						anioProcess = true
						break
					case "MLM1744-COLOREXT":
						colorExt = it.value_name
						colorExtProcess = true
						break
					case "MLM1744-TRANS":
						transmision = it.value_name
						transmisionProcess = true
						break
					case "MLM1744-TAPCUERO":
						vestidura = it.value_name
						vestiduraProcess = true
						break
					default:
						break
				}
			}
			else{
					if (!kilometrajeProcess)
					{
						if (it.id == "MLM1744-KMTS")
						{
							kilometraje = it.value_name
							kilometrajeProcess = true
						}
					}
					if (!marcaProcess)
					{
						if (it.id == "MLM1744-MARC")
						{
						marca = it.value_name
						marcaProcess = true
						}
					}
					if (!modeloProcess)
					{
						if (it.id == "MLM1744-MODL")
						{
						modelo = it.value_name
						modeloProcess = true
						}
					}
					if (!submodeloProcess)
					{
						if (it.id == "MLM1744-VERS")
						{
						submodelo = it.value_name
						submodeloProcess = true
						}
					}
					if (!anioProcess)
					{
						if (it.id == "MLM1744-YEAR")
						{
						anio = it.value_name
						anioProcess = true
						}
					}
					if (!colorExtProcess)
					{
						if (it.id == "MLM1744-COLOREXT")
						{
						colorExt = it.value_name
						colorExtProcess = true
						}
					}
					if (!transmisionProcess)
					{
						if (it.id == "MLM1744-TRANS")
						{
						transmision = it.value_name
						transmisionProcess = true
						}
					}
					if (!vestiduraProcess)
					{
						if (it.id == "MLM1744-TAPCUERO")
						{
						vestidura = it.value_name
						vestiduraProcess = true
						}
					}
			
			} // fin del if

		} // fin del each
		atributos.add(kilometraje)
		atributos.add(marca)
		atributos.add(modelo)
		atributos.add(submodelo)
		atributos.add(anio)
		atributos.add(colorExt)
		atributos.add(transmision)
		if (vestidura == "NO"){ vestidura = "Tela"} // este valor se da por default asi lo enviamos a meli
		atributos.add(vestidura)
		
		return atributos
		
	}
}
