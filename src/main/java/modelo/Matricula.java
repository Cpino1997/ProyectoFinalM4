package modelo;

import java.util.Date;

public class Matricula {
	
	private int idMatricula;
    private int idEstudianteFK; // NOT NULL PK
    private int idCursoFK; // NOT NULL PK
    private Date fecha;

    public Matricula() {
    }

	public Matricula(int idMatricula, int idEstudianteFK, int idCursoFK, Date fecha) {
		super();
		this.idMatricula = idMatricula;
		this.idEstudianteFK = idEstudianteFK;
		this.idCursoFK = idCursoFK;
		this.fecha = fecha;
	}

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getIdEstudianteFK() {
		return idEstudianteFK;
	}

	public void setIdEstudianteFK(int idEstudianteFK) {
		this.idEstudianteFK = idEstudianteFK;
	}

	public int getIdCursoFK() {
		return idCursoFK;
	}

	public void setIdCursoFK(int idCursoFK) {
		this.idCursoFK = idCursoFK;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Matricula [idMatricula=" + idMatricula + ", idEstudianteFK=" + idEstudianteFK + ", idCursoFK="
				+ idCursoFK + ", fecha=" + fecha + "]";
	}

    
}