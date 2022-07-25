package modelo;

public class Curso {

    private int idCurso;
    private String codigoCurso;
    private String nombreCurso;
    private int idFacilitadorFK;

    public Curso() {
    }

	public Curso(int idCurso, String codigoCurso, String nombreCurso, int idFacilitadorFK) {
		super();
		this.idCurso = idCurso;
		this.codigoCurso = codigoCurso;
		this.nombreCurso = nombreCurso;
		this.idFacilitadorFK = idFacilitadorFK;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getIdFacilitadorFK() {
		return idFacilitadorFK;
	}

	public void setIdFacilitadorFK(int idFacilitadorFK) {
		this.idFacilitadorFK = idFacilitadorFK;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", codigoCurso=" + codigoCurso + ", nombreCurso=" + nombreCurso
				+ ", idFacilitadorFK=" + idFacilitadorFK + "]";
	}

    
}
