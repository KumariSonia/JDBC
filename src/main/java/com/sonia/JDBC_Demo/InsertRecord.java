package com.sonia.JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String userName = "root";
		String password = "&oni@78AKSmysql";
		String customerName = "Berglunds snabbköp", contactName = "Christina Berglund", address = "Berguvsvägen 8",
				city = "Luleå", postalCode = "S-958 22", country = "Sweden";

		String query = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES (?, ?, ?, ?, ?, ?)";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, password);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, customerName);
		preparedStatement.setString(2, contactName);
		preparedStatement.setString(3, address);
		preparedStatement.setString(4, city);
		preparedStatement.setString(5, postalCode);
		preparedStatement.setString(6, country);

		int count = preparedStatement.executeUpdate();
		System.out.println(count + " row/s affected");
		preparedStatement.close();
		connection.close();
	}

}
