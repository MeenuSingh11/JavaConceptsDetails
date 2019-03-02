package com.Interviews.programs;

public class MissingNumber {

	public static void main(String[] args) {
		int sum = 0;
		int number[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int n = number[number.length - 1];
		int sum1 = n * (n + 1) / 2;

		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		System.out.println(sum1 - sum);

	}

}
