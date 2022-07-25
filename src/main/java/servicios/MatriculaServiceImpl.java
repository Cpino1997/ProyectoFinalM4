package servicios;

import java.util.List;


import modelo.Matricula;
import vista.MatriculaDAO;
import vista.iMatriculaDAO;

public class MatriculaServiceImpl  implements MatriculaService{

	iMatriculaDAO dao = new MatriculaDAO();
	@Override
	public void crear(Matricula m) {
		dao.create(m);
	}

	@Override
	public List<Matricula> leer() {
		return dao.read();
	}

	@Override
	public Matricula leer(int idMatricula) {
		return dao.read(idMatricula);
	}

	@Override
	public void actualizar(Matricula m) {
		dao.update(m);
	}

	@Override
	public void borrar(int idMatricula) {
		dao.delete(idMatricula);
		}
}