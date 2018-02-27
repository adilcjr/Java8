package com.edea.hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciNumbersTest {

	@Test
	public void testFibonacci() {
		
		assertEquals(0, FibonacciNumbers.fibonacci(0));
		assertEquals(1, FibonacciNumbers.fibonacci(1));
		assertEquals(1, FibonacciNumbers.fibonacci(2));
		assertEquals(2, FibonacciNumbers.fibonacci(3));
		assertEquals(3, FibonacciNumbers.fibonacci(4));
		assertEquals(5, FibonacciNumbers.fibonacci(5));
		assertEquals(8, FibonacciNumbers.fibonacci(6));
		assertEquals(13, FibonacciNumbers.fibonacci(7));
		
		
		
		
	}

}
