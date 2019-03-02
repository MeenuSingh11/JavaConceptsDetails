package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {

		Integer arr[] = { 10, 20, 30, 10, 20 };
		Set<Integer> store = new HashSet<Integer>(Arrays.asList(arr));

		System.out.println(store);

		String str[] = { "A", "B", "C", "A", "C", "C", "D" };
		Set<String> strStore = new HashSet<String>(Arrays.asList(str));

		System.out.println(strStore);

		List<String> temp = new ArrayList<String>();
		List<String> dups = new ArrayList<String>();

		for (String s : str) {
			if (!temp.contains(s)) {
				temp.add(s);
			} else {
				if (!dups.contains(s)) {
					dups.add(s);
				}
			}
		}

		System.out.println(dups);
	}
}
