package servicios;

import java.util.List;

import modelo.Estudiante;

public interface EstudianteService {


	public void crear(Estudiante e); 			// --> Create
	public List<Estudiante> leer(); 			// --> Read todo
	public Estudiante leer(int idEstudiante);	// --> Read solo uno
	public void actualizar(Estudiante e);		// --> Update
	public void borrar(int idEstudiante);	// --> Delete
}
