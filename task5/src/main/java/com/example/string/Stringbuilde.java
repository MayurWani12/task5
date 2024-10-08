package com.example.string;

public class Stringbuilde {
	
	public static void main(String[] args) {
		

	
	StringBuilder builder= new StringBuilder("hello");
	System.out.println(builder);
	
	
	builder.append("word");
	
	
	System.out.println(builder);
	
	builder.insert(5, false);
	
	
	System.out.println(builder);
	
	
	builder.reverse();
	
	System.out.println(builder);
	}
}
