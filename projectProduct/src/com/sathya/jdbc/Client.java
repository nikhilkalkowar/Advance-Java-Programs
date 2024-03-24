package com.sathya.jdbc;

public class Client {

	public static void main (String args[])
	{
//		int count=Dao.create();
//		System.out.println("Table is created "+count);
		
//		int result=Dao.save(new Product(1,"Refrigerator",50000));
//		System.out.println("Data inserted sucessfully "+result);

//		int result1=Dao.save(new Product(2,"Washing machine",30000));
//		System.out.println("Data inserted sucessfully "+result1);
//		
//		int result2=Dao.save(new Product(3,"Television",60000));
//		System.out.println("Data inserted sucessfully "+result2);
//		
//		int result3=Dao.save(new Product(4,"Speakers",10000));
//		System.out.println("Data inserted sucessfully "+result3);
		
		Product p=Dao.findById(4);
		System.out.println(p);
	}
}
