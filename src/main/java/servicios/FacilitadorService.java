package servicios;

import java.util.List;

import modelo.Facilitador;

public interface FacilitadorService {


	public void crear(Facilitador f); 			// --> Create
	public List<Facilitador> leer(); 			// --> Read todo
	public Facilitador leer(int idFa);	// --> Read solo uno
	public void actualizar(Facilitador f);		// --> Update
	public void borrar(int idFa);	// --> Delete
}
