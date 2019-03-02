package com.Interviews.programs;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(1, "Selenium");
		hm.put(2, "java");

		System.out.println(hm.get(1));
		System.out.println(hm.hashCode());

	}

}
