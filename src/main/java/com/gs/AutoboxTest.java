package com.gs;

public class AutoboxTest {

	public static void main(String[] args) {
		Long longWrapperVariable = 2L;
		System.out.println(longWrapperVariable.equals(2));
		System.out.println(longWrapperVariable.equals(2L));

		System.out.println(Integer.valueOf("127") == Integer.valueOf("127"));
		System.out.println(Integer.valueOf("128") == Integer.valueOf("128"));

	}

	static void myOverloadedFunction(long parameter) {
		System.out.println("I am primitive long");
	}

	static void myOverloadedFunction(Integer parameter) {
		System.out.println("i am wrapper class Integer");
	}
}
