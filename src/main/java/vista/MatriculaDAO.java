package vista;

import modelo.Matricula;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexion;

public class MatriculaDAO implements iMatriculaDAO{

	@Override
	public void create(Matricula m) {
		try {

			String sql = "insert into matricula (idEstudianteFK, idCursoFK, fecha) "
					+ "values ('" + m.getIdEstudianteFK() + "', '" + m.getIdCursoFK()  + "', " + m.getFecha() +")";
			
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();

			stt.execute(sql);

		} catch (SQLException x) {
			System.out.println("Error al crear la Matricula");
			x.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}

	
	}

	@Override
	public List<Matricula> read() {
		List<Matricula> matricula = new ArrayList<Matricula>();

		try {

			String sql = "select id_estudiante, id_curso, fecha from matricula";

			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			while (rs.next()) {
				matricula.add( new Matricula(rs.getInt("idMatricula"), rs.getInt("id_estudiante"),rs.getInt("id_curso"), rs.getDate("fecha")));
			}

		} catch (SQLException e) {
			System.out.println("Error al leer Matricula");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return matricula;
	}
	
	@Override
	public Matricula read(int idMatricula) {
		Matricula matricula = null;

		try {

			String sql = "select idEstudianteFK, idCursoFK, fecha from matricula where id= "+idMatricula;
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			if (rs.next()) {
				matricula = new Matricula(rs.getInt("idMatricula"), rs.getInt("id_estudiante"),rs.getInt("id_curso"), rs.getDate("fecha"));

			}

		} catch (SQLException e) {
			System.out.println("Error al leer Matriculas");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return matricula;
	}

	@Override
	public void update(Matricula m) {
		try {
			String sql = "update matricula set id_estudiante = '" + m.getIdEstudianteFK() + "', id_curso = '"
				+ m.getIdCursoFK() + "', fecha = " + m.getFecha();
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();

			stt.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al actualizar Matriculas");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int idMatricula) {
		try {

			String del ="SET FOREIGN_KEY_CHECKS=0";
			String agr ="SET FOREIGN_KEY_CHECKS=1";
			String sql = "delete from matricula where id = " + idMatricula;
			
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			
			stt.execute(del);
			stt.execute(sql);
			stt.execute(agr);

		} catch (SQLException e) {
			System.out.println("Error al eliminar Matricula");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
