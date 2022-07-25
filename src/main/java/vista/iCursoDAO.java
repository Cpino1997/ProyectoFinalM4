package vista;

import java.util.List;
import modelo.Curso;

public interface iCursoDAO {

	public void create(Curso c);
	public Curso read(int idCurso);
	public List<Curso> read();
	public void update(Curso c);
	public void delete(int idCurso);
	
}