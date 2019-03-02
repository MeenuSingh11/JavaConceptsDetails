package com.java.basics;

public class StringManupulation {

	public static void main(String[] args) {

		String str = "1.1";
		String str1 = "1.0";
		int i, j;

		// String a[] = str.split("\\.");
		// String b[] = str1.split("\\.");
		//
		// for (i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
		// }
		//
		// for (j = 0; j < b.length; j++) {
		// System.out.print(b[j]);
		// }

		str = str.replaceAll("\\.", "");
		str1 = str1.replaceAll("\\.", "");

		if ((Integer.parseInt(str) > Integer.parseInt(str1)))
			System.out.println("greterset version is " + str);
		else
			System.out.println("smallest version is " + str1);
	}

}
