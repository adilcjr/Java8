package com.edea.hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

import com.edea.hackerrank.TimeConversion;

public class TimeConversionTest {


	@Test
	public void testTimeConversion() {
		
		String inputs[] = {"03:38:20AM", "12:00:00PM", "07:05:45PM", "09:13:59PM", "12:30:00AM"};
		String results[] = {"03:38:20", "12:00:00", "19:05:45", "21:13:59", "00:30:00"};
		
		String result = null;
		
		for (int i = 0; i < results.length; i++) {
			
			result = TimeConversion.timeConversion(inputs[i]);
			assertEquals(results[i], result);
			System.out.println("result[" + i + "]: " + result);
		}
		
	}

}
