package com.example.string;

public class Mutabletest {

	public static void main(String[] args) {
		
		Mutable mutable=new Mutable(1, "ram", 11111110);
		
		System.out.println(mutable);
		//A mutable class is a class that allows its objects' state or data to 
		//be modified after they are created. In other words, the fields of a mutable 
		//class can be changed at any time through methods provided by the class.
		
		mutable.setId(2);
		mutable.setName("sham");
		mutable.setSalary(122332);
		
		System.out.println(mutable);
		
		
		
	}
	
}
