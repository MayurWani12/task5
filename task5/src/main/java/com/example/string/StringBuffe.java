package com.example.string;

public class StringBuffe {
	
	public static void main(String[] args) {
		
		
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" word");
		
		
		System.out.println(buffer);
		
		
		buffer.insert(6, "java ");
		
		
		System.out.println(buffer);
		
		
		
		
		buffer.reverse();
		
		
		System.out.println(buffer);
		
		//objects are mutable, which means you can modify the content of
		//the object without creating a new one. It’s more efficient than String when you need to perform many modifications.
		
		
		
	}

}
