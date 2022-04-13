package com.mphasis.vini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
	

	public static void main(String[] args) throws SQLException {

		

//       Register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Establish the connection
			Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/great", "root", "");

	System.out.println("connected to the database now.....");

		} catch (ClassNotFoundException e) {
			System.out.println("Can't load the driver : " + e.getMessage());

		}
	}
}
	