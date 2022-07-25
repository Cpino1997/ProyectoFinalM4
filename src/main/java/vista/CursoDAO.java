package vista;

import modelo.Curso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexion;

public class CursoDAO implements iCursoDAO{

	@Override
	public void create(Curso c) {
		try {

			String sql = "insert into curso (id, codigo, nombre, id_facilitador) "
					+ "values ('" + c.getIdCurso() + "', '" + c.getCodigoCurso() + "', '" + c.getNombreCurso() + "' " 
					+ ",  " + c.getIdFacilitadorFK() + ")";

			String del ="SET FOREIGN_KEY_CHECKS=0";
			String agr ="SET FOREIGN_KEY_CHECKS=1";
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			
			stt.execute(del);
			stt.execute(sql);
			stt.execute(agr);

		} catch (SQLException e) {
			System.out.println("Error al crear el Curso");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	@Override
	public Curso read(int idCurso) {
		Curso curso = null;

		try {

			String sql = "SELECT id, codigo, nombre, id_facilitador FROM curso WHERE id = " + idCurso;

			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			if (rs.next()) {
				curso = new Curso(rs.getInt("id"), rs.getString("codigo"),rs.getString("nombre"), rs.getInt("id_facilitador"));

			}

		} catch (SQLException e) {
			System.out.println("Error al leer Cursos");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return curso;
	}

	@Override
	public List<Curso> read() {
		List<Curso> lista = new ArrayList<Curso>();

		try {

			String sql = "SELECT id, codigo, nombre, id_facilitador, last_update FROM curso";

			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			while (rs.next()) {
				lista.add(new Curso(rs.getInt("id"), rs.getString("codigo"),rs.getString("nombre"), rs.getInt("id_facilitador")));

			}

		} catch (SQLException e) {
			System.out.println("Error al leer Curso");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}


	@Override
	public void update(Curso c) {
			try {
				String sql = "update curso set codigo = '" + c.getCodigoCurso() + "', " + " nombre = '"
					+ c.getNombreCurso() + "', id_facilitador = '" + c.getIdFacilitadorFK() + "' where id = " + c.getIdCurso();
				Connection cnn = Conexion.getConnection();
				Statement stt = cnn.createStatement();

				stt.execute(sql);

			} catch (SQLException e) {
				System.out.println("Error al actualizar Curso");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	@Override
	public void delete(int idCurso) {
		try {
			String del ="SET FOREIGN_KEY_CHECKS=0";
			String agr ="SET FOREIGN_KEY_CHECKS=1";
			String sql = "delete from curso where id = " + idCurso;
			
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			
			stt.execute(del);
			stt.execute(sql);
			stt.execute(agr);

		} catch (SQLException e) {
			System.out.println("Error al eliminar Curso");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}