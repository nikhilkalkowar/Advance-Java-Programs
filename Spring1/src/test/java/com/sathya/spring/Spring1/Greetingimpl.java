package com.sathya.spring.Spring1;

public class Greetingimpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("Jai shree Ram");
		
	}
	public Greetingimpl()
	{
		System.out.println("Greeting impl");
	}

}
