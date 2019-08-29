package com.sam.poc;

public class Test2 {

	public Test2() {
		System.out.println("Test 2 constructor...");
	}
	
	// added paramterized constructor
	public Test2(int no) {
		System.out.println("added parameterized constructor - int input - Test2");
	}
	
	// changed branch techpoint-b-3 and will merge into master
	public void testMethod_b3() {
		System.out.println("changed through techpoint-b-3");
	}
	
}
