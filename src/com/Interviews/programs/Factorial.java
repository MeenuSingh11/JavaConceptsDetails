package com.Interviews.programs;

public class Factorial {

	public static int factorial(int num) {

		int fact = 1;
		if (num == 0)
			return 1;
		// for (int i = 1; i <= num; i++) {
		// fact = fact * i;
		// }
		//
		// return fact;

		/* Resurcive method */
		else
			return (num * factorial(num - 1));
	}

	public static void main(String[] args) {

		System.out.println(factorial(3));

	}

}
