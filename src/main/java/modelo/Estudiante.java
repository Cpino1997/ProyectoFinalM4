package modelo;

public class Estudiante {
    private int idEstudiante;
    private String rutEstudiante;
    private String nombreEstudiante;
    private String emailEstudiante;
    private String telefonoEstudiante;
    
	public Estudiante() {
		super();
	}

	public Estudiante(int idEstudiante, String rutEstudiante, String nombreEstudiante, String emailEstudiante,
			String telefonoEstudiante) {
		super();
		this.idEstudiante = idEstudiante;
		this.rutEstudiante = rutEstudiante;
		this.nombreEstudiante = nombreEstudiante;
		this.emailEstudiante = emailEstudiante;
		this.telefonoEstudiante = telefonoEstudiante;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getRutEstudiante() {
		return rutEstudiante;
	}

	public void setRutEstudiante(String rutEstudiante) {
		this.rutEstudiante = rutEstudiante;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getEmailEstudiante() {
		return emailEstudiante;
	}

	public void setEmailEstudiante(String emailEstudiante) {
		this.emailEstudiante = emailEstudiante;
	}

	public String getTelefonoEstudiante() {
		return telefonoEstudiante;
	}

	public void setTelefonoEstudiante(String telefonoEstudiante) {
		this.telefonoEstudiante = telefonoEstudiante;
	}

}