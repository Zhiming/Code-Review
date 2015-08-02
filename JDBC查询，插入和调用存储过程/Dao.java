package ac.nz.unitec.jdbc.jdbc_core;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;

public class Dao

{
	
	public Connection conn;
	
	public Dao() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
		conn.setAutoCommit(false);
	}
	
	public int insert(){
		int count = -1;
		try{
			PreparedStatement ps = conn.prepareStatement("insert into user(name, dt) values(?, ?)");
			ps.setString(1, "zhangsan");
			ps.setTimestamp(2, new Timestamp(new java.util.Date().getTime()));
			count = ps.executeUpdate();
			conn.commit();
		}catch(Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public String query(){
		String str = "";
		try{
			PreparedStatement ps = conn.prepareStatement("select * from user where id=?");
			ps.setInt(1, 1);
			ResultSet rs = ps.executeQuery();
			rs.next();
			str = rs.getString("name");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return str;
	}

	public String callSP(){
		String st = "";
		try{
			CallableStatement cs = conn.prepareCall("{call getUser(?, ?)}");
			cs.setInt(1, 1);
			cs.registerOutParameter(2, Types.INTEGER);
			cs.execute();
			st = cs.getString("o_name") + "";
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return st;
	}
}
