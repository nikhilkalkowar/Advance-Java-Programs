package com.sathya.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	public static int create()
	{
		int count=0;
		
		try(Connection connection=DbConnection.createconnection();
				Statement statement=connection.createStatement())
		{
			String query="create table product(pid number,pname varchar2(20),pcost number)";
			count=statement.executeUpdate(query);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	public static int save(Product p)
	{
		int scount=0;
		
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("insert into product values(?,?,?)"))
		{
			preparedStatement.setInt(1, p.pid);
			preparedStatement.setString(2,p.pname);
			preparedStatement.setDouble(3, p.pcost);
			scount=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return scount;
	}
	
	public static Product findById(int pid)
	{
		Product p=null;
		 
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("select * from product where pid=?"))
		{
			preparedStatement.setInt(1, pid);
			
			 ResultSet rs=preparedStatement.executeQuery();
			 
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
}
