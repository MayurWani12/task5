package com.example.string;

public class Runnab implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("run");
		
	}
	
	
	//Runnable is a functional interface that represents a
	//task that can be executed by a thread. It does not return a result and cannot throw checked exception
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnab());
		thread.start();
		
	}
	

}
