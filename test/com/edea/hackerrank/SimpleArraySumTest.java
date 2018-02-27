package com.edea.hackerrank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.edea.hackerrank.SimpleArraySum;

public class SimpleArraySumTest {
	
	SimpleArraySum sas;

	@Test
	public void testSumSimpleArray() {
		
		int valores1[] = {1, 2, 3, 4, 5};
		
		assertEquals(15, SimpleArraySum.sumSimpleArray(5, valores1));
		
		int valores2[] = {10, 20, 300};
		
		assertEquals(330, SimpleArraySum.sumSimpleArray(3, valores2));
		
		int valores3[] = {540, -80, -460};
		
		assertEquals(0, SimpleArraySum.sumSimpleArray(3, valores3));
		
	}

}
