package com.school.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	String url = "jdbc:mysql://localhost:3306/shubhamdb";
	String username = "root";
	String password = "root";

	// to establish connection
	Connection connection = null;

	public Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2: establish connection
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

}
