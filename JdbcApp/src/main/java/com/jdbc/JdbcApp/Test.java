package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			System.out.println("Connection established Succesfully");
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from aadhar");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			
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
