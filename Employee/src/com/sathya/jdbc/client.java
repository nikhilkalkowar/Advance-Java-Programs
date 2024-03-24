package com.sathya.jdbc;	

public class client {
	
	public static void main(String[] args)
	{
		int a = Dao.create();
		System.out.println("table is created"+a);
		
		int result = Dao.save(new Employee(101,"Nikhil", 85000));
		int result1 = Dao.save(new Employee(102,"Beyounickhil",95000));
		int result2 = Dao.save(new Employee(104,"kalkotwar",95000));
		int result3 = Dao.save(new Employee(105,"nick",95000));
		int result4 = Dao.save(new Employee(106,"nickhil",95000));

		
	}

}
