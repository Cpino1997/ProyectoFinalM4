package vista;

import modelo.Estudiante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexion;

public class EstudianteDAO implements iEstudianteDAO{

	@Override
	public void create(Estudiante e) {
		try {

			String sql = "insert into estudiante (id, rut, nombre, email, telefono) "
					+ "values ('" + e.getIdEstudiante() + "', '" + e.getRutEstudiante()  + "', '" + e.getNombreEstudiante() + "', '" + e.getEmailEstudiante() + "', '" + e.getTelefonoEstudiante() +"')";
			
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();

			stt.execute(sql);

		} catch (SQLException x) {
			System.out.println("Error al crear el Estudiante");
			x.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}

	}

	@Override
	public Estudiante read(int idEstudiante) {
		Estudiante estudiante = null;

		try {

			String sql = "SELECT id, rut , nombre, email, telefono FROM estudiante WHERE id = " + idEstudiante;

			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			if (rs.next()) {
				estudiante = new Estudiante(rs.getInt("id"), rs.getString("nombre"),rs.getString("rut"), rs.getString("email"),rs.getString("telefono"));

			}

		} catch (SQLException e) {
			System.out.println("Error al leer Estudiante1");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return estudiante;
	}
	

	
	public List<Estudiante> read() {
		List<Estudiante> lista = new ArrayList<Estudiante>();

		try {

			String sql = "select id, rut, nombre, email, telefono FROM estudiante";

			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			while (rs.next()) {
				lista.add(new Estudiante(rs.getInt("id"), rs.getString("nombre"),rs.getString("rut"), rs.getString("email"),rs.getString("telefono")));

			}

		} catch (SQLException e) {
			System.out.println("Error al leer Estudiante 2");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}
	@Override
	public void update(Estudiante e) {
			try {

				String sql = "update estudiante set rut = '" + e.getRutEstudiante() + "', " + " nombre = '"
						+ e.getNombreEstudiante() + "', email = '" + e.getEmailEstudiante() + "', telefono = '" + e.getTelefonoEstudiante() + "' where id = " + e.getIdEstudiante();
				Connection cnn = Conexion.getConnection();
				Statement stt = cnn.createStatement();

				stt.execute(sql);

			} catch (SQLException x) {
				System.out.println("Error al actualizar Estudiante");
				x.printStackTrace();
			} catch (Exception x) {
				x.printStackTrace();
			}
		
	}

	@Override
	public void delete(int idEstudiante) {
		try {
			String del ="SET FOREIGN_KEY_CHECKS=0";
			String agr ="SET FOREIGN_KEY_CHECKS=1";
			String sql = "delete from estudiante where id = " + idEstudiante;
			
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			stt.execute(del);
			stt.execute(sql);
			stt.execute(agr);

		} catch (SQLException x) {
			System.out.println("Error al eliminar estudiante");
			x.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		
	}
}
