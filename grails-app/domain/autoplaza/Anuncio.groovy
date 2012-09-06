package autoplaza

class Anuncio {

	static belongsTo = [contacto:Contacto]
	
	String identificador
	String marca
	String modelo
	int anio
	String urlFotoPrincipal
	String Estado
	double precio
	String tipoMoneda
	
	Date fechaRegistro
	double kilometraje
	String descripcion
	String equipamiento
	String version_sub
	String colorExterior
	String colorInterior
	String tipoVestidura
	String tipoTransmision
	
	
	static constraints = {
		
		identificador(blank:false)
		marca(blank:false)
		modelo(blank:false)
		anio(blank:false)
		precio(blank:false)
		
    }
	
}
