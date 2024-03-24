	package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection createconnection()
	{
		Connection connection=null;
		try
		{
			//loading driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Creating connection
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
