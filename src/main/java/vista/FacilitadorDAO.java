package vista;

import modelo.Facilitador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexion;

public class FacilitadorDAO implements iFacilitadorDAO{

	@Override
	public void create(Facilitador f) {
		try {

			String sql = "insert into Facilitador (id, rut, nombre, email, telefono, valorhora,banco,ctabancaria) "
					+ "values ('" + f.getIdFa() + "', '" + f.getRutFa()  + "', '" + f.getNombreFa() + "', '" + f.getEmailFa() + "', '" + f.getTelefonoFa()+ "', '" +f.getValorHora()+"', '"+f.getBancoFa()+"', "+f.getCtaBancariaFa()+")";
			
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();

			stt.execute(sql);

		} catch (SQLException x) {
			System.out.println("Error al crear el Facilitador");
			x.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}

	
	}

	@Override
	public Facilitador read(int idFa) {
		Facilitador facilitador = null;

		try {

			String sql = "SELECT id, rut, nombre, email, telefono, valorhora, banco, ctabancaria FROM facilitador WHERE id = " + idFa;
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			if (rs.next()) {
				facilitador = new Facilitador(rs.getInt("id"), rs.getString("rut"),rs.getString("nombre"), rs.getString("email"),rs.getString("telefono"),rs.getFloat("valorhora"),rs.getString("banco"),rs.getString("ctabancaria"));

			}

		} catch (SQLException e) {
			System.out.println("Error al leer Facilitador");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return facilitador;
	}
	

	@Override
	public List<Facilitador> read() {
		List<Facilitador> facilitador = new ArrayList<Facilitador>();

		try {

			String sql = "SELECT id, rut, nombre, email, telefono, valorhora, banco, ctabancaria FROM facilitador";

			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			ResultSet rs = stt.executeQuery(sql);

			while (rs.next()) {
				facilitador.add( new Facilitador(rs.getInt("id"), rs.getString("rut"),rs.getString("nombre"), rs.getString("email"),rs.getString("telefono"),rs.getFloat("valorhora"),rs.getString("banco"),rs.getString("ctabancaria")));
			}

		} catch (SQLException e) {
			System.out.println("Error al leer Facilitador");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return facilitador;
	}
	

	@Override
	public void update(Facilitador f) {
		try {
			String sql = "update facilitador set rut = '" + f.getRutFa() + "', nombre = '"
				+ f.getNombreFa() + "', email = '" + f.getEmailFa() + "', telefono = '" + f.getTelefonoFa()+ "', valorhora = '" + f.getValorHora()  + "', banco = '" + f.getBancoFa() + "', ctabancaria = '" + f.getCtaBancariaFa() + "' where id = " + f.getIdFa();
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();

			stt.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al actualizar Facilitador");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
		
	@Override
	public void delete(int idFa) {
		try {

			String del ="SET FOREIGN_KEY_CHECKS=0";
			String agr ="SET FOREIGN_KEY_CHECKS=1";
			String sql = "delete from curso where id = " + idFa;
			
			Connection cnn = Conexion.getConnection();
			Statement stt = cnn.createStatement();
			
			stt.execute(del);
			stt.execute(sql);
			stt.execute(agr);

		} catch (SQLException e) {
			System.out.println("Error al eliminar Facilitador");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

