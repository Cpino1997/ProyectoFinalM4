package vista;

import java.util.List;

import modelo.Matricula;

public interface iMatriculaDAO {
	public void create(Matricula m);
	public Matricula read(int idMatricula);
	public List<Matricula> read();
	public void update(Matricula m);
	public void delete(int idMatricula);
}
