package autoplaza

class Anuncio {

	
	
	double anuncioid
	String identificador
	int marcaID
	String marca
	int modeloID
	String modelo
	float submodeloID
	String submodelo
	int anio
	String imagen
	int estadoID
	String Estado
	int tipoAnuncioID
	Date fechaRegistro  // verificar el tipo date
	Date fechaModificacion // verificar el tipo date
	double precio
	int kilometraje
	int financiamiento
	int empresaID
	String tipoMoneda
	String colorExterior
	String ColorInterior
	String transmision
	String vestidura
	String equipamiento
	float personaID
	String nombrePersona
	String telefono1
	String telefono2
	String telefono3
	String email
	String descripcion
	
	
	static constraints = {
		anuncioid(blank:false)
		identificador(blank:false)
		marca(blank:false)
		modelo(blank:false)
		submodelo(blank:false)
		anio(blank:false)
		precio(blank:false)
		kilometraje(blank:false)
		fechaRegistro(min:new Date()-365)
		personaID(blank:false)
    }
	
	void consultarAnuncio (String ident)
	{
		// aqui colocamos un metodo para cargar los datos pero esto es para el detalle
	}

	
	
}
