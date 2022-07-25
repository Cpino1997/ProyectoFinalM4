package servicios;

import java.util.List;
import modelo.Curso;


public interface CursoService {

	public void crear(Curso c); 			// --> Create
	public List<Curso> leer(); 			// --> Read todo
	public Curso leer(int idCurso);	// --> Read solo uno
	public void actualizar(Curso c);		// --> Update
	public void borrar(int idCurso);	// --> Delete
}