package com.Interviews.programs;

import java.util.ArrayList;
import java.util.List;

public class DuplicateInt {

	public static void main(String args[]) {

		// /* Remove the duplicate element from the Integer array */
		// Integer array[] = { 10, 20, 30, 40, 10, 20 };
		//
		// Set<Integer> store = new HashSet<Integer>(Arrays.asList(array));
		// System.out.println(store);
		//
		// /* Remove the duplicate String from the Integer array */
		// String str[] = { "Meenu", "Rahul", "test", "Meenu", "Rahul" };
		// Set<String> store1 = new HashSet<String>(Arrays.asList(str));
		// System.out.println(store1);
		//
		// /* find the duplicate element from the Integer array */
		Integer arr[] = { 10, 20, 30, 40, 10, 20, 10 };
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> dup_list = new ArrayList<Integer>();
		for (int i : arr) {
			if (!list.contains(i))
				list.add(i);
			else if (!dup_list.contains(i))
				dup_list.add(i);
		}
		System.out.println(dup_list);

	}

}
