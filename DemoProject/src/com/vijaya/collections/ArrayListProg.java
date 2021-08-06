package com.vijaya.collections;
import java.io.*;
import java.util.*;

public class ArrayListProg {
	public static void main(String[] args)
	{

		// Declaring the ArrayList with
		// initial size n
		ArrayList<Object> al = new ArrayList<>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			al.add(i);
	

		// Printing elements
		System.out.println(al);
		 al.add("Shwetha");
       al.add(12.5);
		// Remove element at index 3
		al.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(al);

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i) + " ");
	}
}
