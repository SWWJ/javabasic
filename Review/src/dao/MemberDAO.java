package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

import util.ConnectionPool;

public class MemberDAO {

	public int login(String uid, String ups) throws NamingException, SQLException {
		Connection conn = null; // DB 연결
		PreparedStatement stmt = null; // SQL 구문
		ResultSet rs = null; // SQL 결과

		try {
			conn = ConnectionPool.get();
			String sql = "SELECT id, password FROM user WHERE id = ?";

			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);

			rs = stmt.executeQuery();

			if (!rs.next())
				return 1;

			if (!ups.equals(rs.getString("password")))
				return 2;

			return 0;
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}

	public boolean exist(String uid) throws NamingException, SQLException {
		Connection conn = null; // DB 연결
		PreparedStatement stmt = null; // SQL 구문
		ResultSet rs = null; // SQL 결과

		try {
			conn = ConnectionPool.get();
			String sql = "SELECT id FROM user WHERE id = ?";

			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);

			rs = stmt.executeQuery();

			return rs.next();
			
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}

	public boolean insert(String uid, String ups, String una, String uem, String uge)
			throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = ConnectionPool.get();
			String sql = "INSERT INTO user(id, password, name, gender, email) VALUES (?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, ups);
			stmt.setString(3, una);
			stmt.setString(4, uge);
			stmt.setString(5, uem);

			int result = stmt.executeUpdate();
			
			return result == 1;
			
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}
	
	public boolean delete(String uid) throws NamingException, SQLException {
		Connection conn = null; // DB 연결
		PreparedStatement stmt = null; // SQL 구문

		try {
			conn = ConnectionPool.get();
			String sql = "DELETE FROM user WHERE id = ?";

			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);

			int result = stmt.executeUpdate();

			return result == 1;
			
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}
	
	
}
