package autoplaza

class Anuncio {

	String identificador
	String marca
	String modelo
	int anio
	String urlFotoPrincipal
	String Estado
	double precio
	String tipoMoneda
	
	
	static constraints = {
		
		identificador(blank:false)
		marca(blank:false)
		modelo(blank:false)
		anio(blank:false)
		precio(blank:false)
		
    }
	
}
