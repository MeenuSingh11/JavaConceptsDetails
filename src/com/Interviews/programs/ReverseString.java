package com.Interviews.programs;

public class ReverseString {

	public static void main(String args[]) {

		String str = "helloworld";
		String rev = "";

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println("Value od the reverse string: " + rev);

	}
}
