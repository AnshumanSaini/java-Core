package com.jdbc.JdbcApp;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test3 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			System.out.println("Connection established Succesfully");
			stmt=con.prepareStatement("insert into profile values(?,?);");
			stmt.setString(1, "Image");
			FileInputStream fs=new FileInputStream("E:\\HSC training\\profile\\image.png");
			stmt.setBinaryStream(2, fs);
			int status=stmt.executeUpdate();
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
