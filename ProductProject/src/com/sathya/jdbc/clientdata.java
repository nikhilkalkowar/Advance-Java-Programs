package com.sathya.jdbc;

public class clientdata {

	public static void main(String[] args) {
		
//		int counts = Dao.createt();
//		System.out.println("table created"+counts);
//		
//		int result = Dao.save(new Product(1,"Tv",65000));
//		System.out.println("inserted successfull" +result);
//		
//		int result1 = Dao.save(new Product(2,"Washing machine",25000));
//		System.out.println("inserted successfull" +result1);
//		
//		int result2 = Dao.save(new Product(3,"Bike",265000));
//		System.out.println("inserted successfull" +result2);
//		
//		int result3 = Dao.save(new Product(4,"AC",35000));
//		System.out.println("inserted successfull" +result3);
//		
//		int result4 = Dao.save(new Product(5,"Car",1650000));
//		System.out.println("inserted successfull" +result4);
		
		Product p=Dao.findById(4);
		System.out.println(p);
		
		int countt=Dao.deletebyId(4);
		System.out.println(countt);
		
		int dcount = Dao.deletebyPrice(265000);
		System.out.println(dcount);
	}

}
