package com.sathya.spring.Spring1;

public class Greeetingimpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("Jai Shree Ram");
		
	}
	
	public Greeetingimpl()
	{
		System.out.println("Greeting IMPL");
	}

	
}
