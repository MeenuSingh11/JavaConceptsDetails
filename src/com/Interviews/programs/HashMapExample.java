package com.Interviews.programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String args[]) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "java");
		hm.put(3, "null");
		hm.put(4, "null");/* Hasmap can store multiple null values */

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}

}
