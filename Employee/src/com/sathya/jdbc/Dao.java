package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	
	public static int create()
	{
		int count =0;
		try(Connection connection = Dbconnection.create();
				Statement statement = connection.createStatement())
		{
			String query = "create  table emp(empid number, empname varchar(20), empsal number)";
			count = statement.executeUpdate(query);
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public static int save(Employee e) {
		int couunt = 0;
		
		try(Connection connection = Dbconnection.create();
				PreparedStatement preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)"))		
		{
			preparedStatement.setInt(1,e.empid);
			preparedStatement.setString(2, e.empname);
			preparedStatement.setDouble(3, e.empsal);
			
		}
		catch (SQLException e2)
		{
			e2.printStackTrace();
		}
		return couunt; 
	}

}
