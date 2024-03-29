package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Test2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			System.out.println("Connection established Succesfully");
			stmt=con.prepareStatement("update employee set ename=? where empid=?;");
			stmt.setString(1, "Hughes");
			stmt.setInt(2, 110);
			int status = stmt.executeUpdate();
			if(status>0) System.out.println("success");
			else System.out.println("error");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
