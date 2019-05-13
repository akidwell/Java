package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.User;
import db.DAO;

public class UserDB implements DAO<User> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prs";
		String username = "prs_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}
	@Override
	public User get(int id) {
		String sql = "SELECT * FROM User " + "where id = ? ";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("ID");      		
				String userName = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNumber");
				String email = rs.getString("email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isAdmin");
				User u = new User(id, userName, password, firstName, 
									lastName, phoneNumber, email, isReviewer, isAdmin);
				return u;
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
	public List<User> getAll() {
		String sql = "SELECT id, userName, password, firstName, "
				+ "lastName, phoneNumber, email, isReviewer, isAdmin " + "From User";
		List<User> users = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				int id = rs.getInt("ID");      		
				String userName = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNumber");
				String email = rs.getString("email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isAdmin");
				User u = new User(id, userName, password, firstName, 
									lastName, phoneNumber, email, isReviewer, isAdmin);
				users.add(u);
			}

		} catch (SQLException e) {
			System.err.println(e);
			users = null;
		}

		return users;
	}

	@Override
	public boolean add(User t) {
		String sql = "INSERT INTO User (userName, password, firstName, lastName, "
				+ "phoneNumber, email, isreviewer, isadmin) " + "Values (?,?,?,?,?,?,?,?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, t.getUserName());
			ps.setString(2, t.getPassword());
			ps.setString(3, t.getFirstName());
			ps.setString(4, t.getLastName());
			ps.setString(5, t.getPhoneNumber());
			ps.setString(6, t.getEmail());
			ps.setBoolean(7, t.isReviewer());
			ps.setBoolean(8, t.isAdmin());
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

	@Override
	public boolean delete(User t) {
		String sql = "delete from User " + "where id = ? ";
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
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

}
