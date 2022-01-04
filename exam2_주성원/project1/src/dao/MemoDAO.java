package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemoDAO {
	
	public boolean insert(String uid, String ume)
			throws NamingException, SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = ConnectionPool.get();
			String sql = "INSERT INTO tbvisit(id, memo) VALUES (?,?)";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, ume);

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
