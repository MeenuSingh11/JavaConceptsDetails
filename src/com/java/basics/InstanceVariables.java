package com.java.basics;

public class InstanceVariables {

	int i = 10;
	String s = "Static";

	public static void main(String[] args) {

		InstanceVariables is = new InstanceVariables();
		InstanceVariables is1 = new InstanceVariables();

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
