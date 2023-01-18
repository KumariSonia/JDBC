package com.sonia.JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String userName = "root";
		String password = "&oni@78AKSmysql";
		String query = "select * from Customers";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3)
					+ "  " + resultSet.getString(4) + "  " + resultSet.getString(5) + "  " + resultSet.getString(6)
					+ "  " + resultSet.getString(7));
		statement.close();
		connection.close();

	}

}
