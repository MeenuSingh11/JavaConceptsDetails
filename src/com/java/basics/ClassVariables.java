package com.java.basics;

public class ClassVariables {

	/* class /static variable */

	static int i = 10;
	static String s = "Static";

	public static void main(String[] args) {

		ClassVariables is = new ClassVariables();
		ClassVariables is1 = new ClassVariables();

		System.out.println(is.i);
		System.out.println(is.s);

		System.out.println(is1.i);
		System.out.println(is1.s);

		is.i = 20;
		System.out.println("////////////////////////");
		System.out.println(is.i);
		System.out.println(is.s);

		System.out.println(is1.i);
		System.out.println(is1.s);
	}

}
