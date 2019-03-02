package com.java.oops;

public class TestCar {

	public static void main(String[] args) {

		// Bmw b = new Bmw();
		// b.start(); // overridden method
		// b.stop();
		// b.refuel();
		// b.threadsafty();
		//
		// System.out.println("*************");

		Car c = new Bmw();
		c.start();
		c.stop();
		c.refuel();

		System.out.println("*************");

		c = new Toyota();
		c.start();
		c.stop();
		c.refuel();
		/* Factory Pattern is the example of dynamic polymorphism */
	}

}
