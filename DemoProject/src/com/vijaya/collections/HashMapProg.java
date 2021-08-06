package com.vijaya.collections;
import java.util.*;
public class HashMapProg {
	public static void main(String args[])
	{
		// Creating HashMap and
		// adding elements
		HashMap<Integer, String> hm= new HashMap<Integer, String>();

		hm.put(1, "Shwetha");
		hm.put(2, "Teena");
		hm.put(3, "Rani");
		hm.put(3, "abc");

		// Finding the value for a key
		System.out.println("Value for 1 is " + hm.get(1));

		// Traversing through the HashMap //for each loop
		for (Map.Entry<Integer, String> e : hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	
	  System.out.println(hm.keySet());
	  System.out.println(hm.entrySet());
	}
	
	
}
