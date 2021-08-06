package com.vijaya.interfaces;

// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface In1 
{ 
	final int a = 10; 
	default void display() 
	{ 
		System.out.println("hello"); 
	} 
} 

// A class that implements the interface. 
class TestDefaultMethodFeature implements In1 
{ 
	// Driver Code 
	public static void main (String[] args) 
	{ 
		TestDefaultMethodFeature t = new TestDefaultMethodFeature(); 
		t.display(); 
	} 
} 
