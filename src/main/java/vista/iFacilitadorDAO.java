package vista;

import java.util.List;
import modelo.Facilitador;

public interface iFacilitadorDAO {
	public void create(Facilitador f);
	public Facilitador read(int idFa);
	public List<Facilitador> read();
	public void update(Facilitador f);
	public void delete(int idFa);
}
