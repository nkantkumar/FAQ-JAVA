package com.scb.java8.practice;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibinacciWithMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibinacciWithMemory fb= new FibinacciWithMemory();
		BigInteger b= fb.fib(10);
		System.out.println(b);
	}
	
	public BigInteger fib(long i) {
		Map<Long, BigInteger> cache = new HashMap<>();

		if (i == 0) return BigInteger.ZERO; if (i == 1) return BigInteger.ONE;
		return cache.computeIfAbsent(i, n -> fib(n - 2).add(fib(n - 1))); }

}
