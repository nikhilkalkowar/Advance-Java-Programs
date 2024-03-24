package com.sathya.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ProductDao {

	public static int save(Product product)
	{
		
		Connection connection=null;
		PreparedStatement ps=null;
		int count=0;
		
		try
		{
			//connection called by method name and class name
		connection=DbConnection.createconnection();
			// PrepareStatement object created
		 ps=connection.prepareStatement("insert into product values(?,?,?,?,?,?,?,?)");
		 ps.setString(1, product.getProId());
		 ps.setString(2,product.getProName() );
		 ps.setDouble(3,product.getProPrice());
		 ps.setString(4,product.getProBrand());
		 ps.setString(5,product.getProMadeIn());
		 ps.setDate(6,product.getProMfgDate());
		 ps.setDate(7,product.getProExpDate());
		 ps.setBinaryStream(8,product.getProImage());
		 
		 count=ps.executeUpdate();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		finally {
			
			try
			{
				if(connection!=null && ps!=null)
				{
					connection.close();
					ps.close();
				}
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
				
		}
		return count;
	}
}
