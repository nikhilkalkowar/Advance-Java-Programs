package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	
	public static int createt()
	{
		int count =0;
		try(Connection connection=jdbcConnection.create();
				Statement statement = connection.createStatement())
		{
			String query = "create table product(pid number,pname varchar2(20),pcost number)";
			count = statement.executeUpdate(query);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
		
	}
	
	public static int save(Product p)
	{
		int countt =0;
		
		try (Connection connection =jdbcConnection.create();
				PreparedStatement preparedStatement=connection.prepareStatement("insert into product values(?,?,?)"))
		{
			preparedStatement.setInt(1, p.pid);
			preparedStatement.setString(2,p.pname);
			preparedStatement.setDouble(3, p.pcost);
			countt=preparedStatement.executeUpdate();
		}
		catch(SQLException e)	
		{
			e.printStackTrace();
		}
		return countt;
	}
	
	public static Product findById(int pid)
	{
		Product p = null;
		
		try(Connection connection = jdbcConnection.create();
				PreparedStatement preparedStatement=connection.prepareStatement("select*from product where pid=?"))
		{
			preparedStatement.setInt(1,pid);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next())
			{
				p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPcost(rs.getDouble(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return p;
	}
	public static int deletebyId(int pid)
	{
		int countt = 0;
		try(Connection connection = jdbcConnection.create();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from product where pId=?"))
		{
			preparedStatement.setInt(1, pid);
			countt =preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return countt;
	}
	
	public static int deletebyPrice(double pcost)
	{
		int dcount = 0;
		try(Connection connection = jdbcConnection.create();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from product where pcost=?"))
		{
			preparedStatement.setDouble(1, pcost);
			
			dcount = preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			 e.printStackTrace();
		}
		return dcount;
	}
	
	
}
