package servicios;

import java.util.List;

import modelo.Matricula;

public interface MatriculaService {


	public void crear(Matricula m); 			// --> Create
	public List<Matricula> leer(); 			// --> Read todo
	public Matricula leer(int idMatricula);	// --> Read solo uno
	public void actualizar(Matricula m);		// --> Update
	public void borrar(int idMatricula);	// --> Delete
}
