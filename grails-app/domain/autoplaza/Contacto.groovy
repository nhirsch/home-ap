package autoplaza

class Contacto {

    int id 
	String nombre
	String email
	String tipoTelefono
	String lada
	String telefono
	String tipoTelefono2
	String lada2
	String telefono2
	String estado
	
	static constraints = {
//		contactoID (blank:false, nullable:false)
		email (blank:false, email:true)
		lada (blank:false)
		telefono (blank:false)
		tipoTelefono (blank:false)
    }

	static hasMany = [anuncios:Anuncio] // una contacto puede tener M anuncios
	
}
