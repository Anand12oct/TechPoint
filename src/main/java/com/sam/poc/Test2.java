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
	
	// added through techpoint-b-2
	public void testMethod_b2() {
		System.out.println("added through techpoint_b_2");
	}
	
	// test in eclipse only
	public void eclipseMethod() {
		System.out.println("eclipse method.....");
	}
	
}
