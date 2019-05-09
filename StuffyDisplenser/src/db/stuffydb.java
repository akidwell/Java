package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Business.Stuffy;

public class stuffydb implements DAO<Stuffy> {
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/stuffydb";
		String username = "stuffydb_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}

	@Override
	public Stuffy get(int id) {
		String sql = "SELECT * FROM Stuffy " + "where id = ? ";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("ID");
				String type = rs.getString("Type");
				String color = rs.getString("color");
				String size = rs.getString("size");
				int limbs = rs.getInt("limbs");
				Stuffy s = new Stuffy(id, type, color, size, limbs);
				return s;
			} else {
				rs.close();
				return null;
			}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}

	}

	@Override
	public List<Stuffy> getAll() {
		String sql = "SELECT id, type, color, size, limbs " + "From Stuffy";
		List<Stuffy> stuffies = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {

				int id = rs.getInt("id");
				String type = rs.getString("type");
				String color = rs.getString("color");
				String size = rs.getString("size");
				int limbs = rs.getInt("limbs");
				

				Stuffy s = new Stuffy(id, type, color, size, limbs);
				stuffies.add(s);
			}

		} catch (SQLException e) {
			System.err.println(e);
			stuffies = null;
		}

		return stuffies;
	}


	@Override
	public boolean add(Stuffy t) {
		String sql = "INSERT INTO Stuffy (type, color, size, limbs) " + "Values (?,?,?,?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, t.getType());
			ps.setString(2, t.getColor());
			ps.setString(3, t.getSize());
			ps.setInt(4, t.getLimbs());
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

	@Override
	public boolean delete(Stuffy t) {
		String sql = "delete from Stuffy " + "where id = ? ";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, t.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

	@Override
	public boolean update(Stuffy t) {
		// TODO Auto-generated method stub
		return false;
	}


}
