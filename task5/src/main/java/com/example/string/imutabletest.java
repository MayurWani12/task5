package com.example.string;

public class imutabletest {
	
	public static void main(String[] args) {
		
		Imutable imutable=new Imutable("ram", 111120);
		
		Imutable update=imutable.withName("sham");
		
		
		System.out.println(imutable);
		
		System.out.println(update);
		
		
		
	}

}
