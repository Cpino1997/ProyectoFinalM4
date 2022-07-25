package vista;

import java.util.List;
import modelo.Estudiante;

public interface iEstudianteDAO {

	public void create(Estudiante e);
	public Estudiante read(int idEstudiante);
	public List<Estudiante> read();
	public void update(Estudiante e);
	public void delete(int idEstudiante);
}
