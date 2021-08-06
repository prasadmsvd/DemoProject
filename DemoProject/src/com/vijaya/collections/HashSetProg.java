package com.vijaya.collections;
import java.util.*;
public class HashSetProg{
	public static void main(String args[])
	{
		// Creating HashSet and
		// adding elements
		HashSet<String> hs = new HashSet<String>();

		hs.add("Teena");
		hs.add("Shwetha");
		
		System.out.println(hs.add("Rani"));
		System.out.println(hs.add("Teena"));
		
		hs.add("Mahesh");
       
		// Traversing elements
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
