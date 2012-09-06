package autoplaza

class Anuncio {

	int id
	String uid	//String unique identifier
	String marca
	String modelo
	int anio
	String urlFotoPrincipal
	String estado
	double precio
	String tipoMoneda
	
	Date fechaRegistro
	double kilometraje
	String descripcion
	String equipamiento
	String versionSub
	String colorExterior
	String colorInterior
	String tipoVestidura
	String tipoTransmision

	static constraints = {
//		uid(blank:false, unique:true)
		marca(blank:false)
		modelo(blank:false)
		anio(blank:false)
		precio(blank:false)
		
    }

	static belongsTo = [contacto:Contacto]

}
