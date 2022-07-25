package servicios;

import java.util.List;

import modelo.Estudiante;
import vista.EstudianteDAO;
import vista.iEstudianteDAO;

public class EstudianteServiceImpl implements EstudianteService {

	iEstudianteDAO dao = new EstudianteDAO();
	@Override
	public void crear(Estudiante e) {
		dao.create(e);
	}

	@Override
	public List<Estudiante> leer() {
		return dao.read();
	}

	@Override
	public Estudiante leer(int idEstudiante) {
		return dao.read(idEstudiante);
	}

	@Override
	public void actualizar(Estudiante e) {
		dao.update(e);
	}

	@Override
	public void borrar(int idEstudiante) {
		dao.delete(idEstudiante);
	}


}
