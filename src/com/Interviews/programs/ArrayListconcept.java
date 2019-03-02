package com.Interviews.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListconcept {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("meenu");
		list.add("hello");
		list.add("xyz");

		System.out.println(list);

		for (String s : list)
			System.out.println(s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}

	}

}
