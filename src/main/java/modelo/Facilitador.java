package modelo; 

public class Facilitador {
    private int idFa;
    private String rutFa;
    private String nombreFa;
    private String emailFa;
    private String telefonoFa;
    private float valorHora;
    private String bancoFa;
    private String ctaBancariaFa;

	public Facilitador() {
		super();
	}

	public Facilitador(int idFa, String rutFa, String nombreFa, String emailFa, String telefonoFa, float valorHora,
			String bancoFa, String ctaBancariaFa) {
		super();
		this.idFa = idFa;
		this.rutFa = rutFa;
		this.nombreFa = nombreFa;
		this.emailFa = emailFa;
		this.telefonoFa = telefonoFa;
		this.valorHora = valorHora;
		this.bancoFa = bancoFa;
		this.ctaBancariaFa = ctaBancariaFa;
	}

	public int getIdFa() {
		return idFa;
	}

	public void setId(int idFa) {
		this.idFa = idFa;
	}

	public String getRutFa() {
		return rutFa;
	}

	public void setRutFa(String rutFa) {
		this.rutFa = rutFa;
	}

	public String getNombreFa() {
		return nombreFa;
	}

	public void setNombreFa(String nombreFa) {
		this.nombreFa = nombreFa;
	}

	public String getEmailFa() {
		return emailFa;
	}

	public void setEmailFa(String emailFa) {
		this.emailFa = emailFa;
	}

	public String getTelefonoFa() {
		return telefonoFa;
	}

	public void setTelefonoFa(String telefonoFa) {
		this.telefonoFa = telefonoFa;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public String getBancoFa() {
		return bancoFa;
	}

	public void setBancoFa(String bancoFa) {
		this.bancoFa = bancoFa;
	}

	public String getCtaBancariaFa() {
		return ctaBancariaFa;
	}

	public void setCtaBancariaFa(String ctaBancariaFa) {
		this.ctaBancariaFa = ctaBancariaFa;
	}

 
    
}