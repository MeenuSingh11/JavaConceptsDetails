package com.Interviews.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String args[]) {

		HashSet<String> hs = new HashSet();
		hs.add("Meenu");
		hs.add("xyz");
		hs.add("Rahul");

		// System.out.println(hs);

		// for (String s : hs) {
		// System.out.println(s);
		//
		ArrayList<String> as = new ArrayList<String>(hs);
		java.util.Collections.sort(as);
		Iterator<String> itr = hs.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
	}

}
