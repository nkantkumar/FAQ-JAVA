package com.gs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.class.getClassLoader());
		 
        // Test class is loaded by Application loader
        System.out.println(Test.class.getClassLoader());

	}

}
