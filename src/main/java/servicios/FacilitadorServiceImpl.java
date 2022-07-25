package servicios;

import java.util.List;

import modelo.Facilitador;
import vista.FacilitadorDAO;
import vista.iFacilitadorDAO;

public class FacilitadorServiceImpl implements FacilitadorService{

	iFacilitadorDAO dao = new FacilitadorDAO();
	@Override
	public void crear(Facilitador f) {
		dao.create(f);
		
	}

	@Override
	public List<Facilitador> leer() {
		return dao.read();
	}

	@Override
	public Facilitador leer(int idFa) {
		return dao.read(idFa);
	}

	@Override
	public void actualizar(Facilitador f) {
		dao.update(f);
		
	}

	@Override
	public void borrar(int idFa) {
		dao.delete(idFa);
		
	}

}
