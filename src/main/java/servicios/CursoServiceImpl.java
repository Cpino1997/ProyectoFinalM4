package servicios;

import java.util.List;

import modelo.Curso;
import vista.CursoDAO;
import vista.iCursoDAO;

public class CursoServiceImpl implements CursoService {


	iCursoDAO dao = new CursoDAO();
	@Override
	public void crear(Curso c) {
		dao.create(c);
	}

	@Override
	public List<Curso> leer() {
		return dao.read();
	}

	@Override
	public Curso leer(int idCurso) {
		return dao.read(idCurso);
	}

	@Override
	public void actualizar(Curso c) {
		dao.update(c);
	}

	@Override
	public void borrar(int idCurso) {
		dao.delete(idCurso);
	}

}
