package com.vijaya.interfaces;
public interface TempI { 

 int number=80; //by default it is 
public abstract void div(int a, int b); 

public default void
add(int a, int b) 
{ 
System.out.print("Answer by Default method = "); 
System.out.println(a + b); 
} 

public static void mul(int a, int b) 
{ 
System.out.print("Answer by Static method = "); 
System.out.println(a * b); 
} 
} 
