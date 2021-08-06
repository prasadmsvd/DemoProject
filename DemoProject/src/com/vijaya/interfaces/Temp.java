package com.vijaya.interfaces;

// Java 8 program to illustrate 
// static, default and abstract methods in interfaces 

class Temp implements TempI { 

	@Override
	public void div(int a, int b) 
	{ 
		System.out.print("Answer by Abstract method = "); 
		System.out.println(a / b); 
	} 

	public static void main(String[] args) 
	{ 
		
		TempI in = new Temp(); 
		in.div(8, 2); 
		in.add(3, 1); 	
		TempI.mul(4, 1); 
		//number = 90;  unncomment it to see compiletime error
         System.out.println(number+" from interface");

	} 
} 
