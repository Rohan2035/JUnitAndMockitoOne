package com.course.JUnitAndMockitoLearning.temp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TempTestThree {
	
	@Test
	public void testAssertion() {
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 1;
		int val2 = 2;
		
		String[] arrayOne = new String[] {"Rohan", "Venkatesh", "Gupta"};
		String[] arrayTwo = new String[] {"Rohan", "Venkatesh", "Gupta"};
		
		// Check that two objects are equal
		assertEquals(str1, str2);
		
		// Check for the true condition
		assertTrue(val2 > val1);
		
		// Check for the false condition
		assertFalse(val1 > val2);
		
		// Check that object is not null
		assertNotNull(str1);
		
		// Check that the object is null
		assertNull(str3);
		
		// Check whether the reference point the same object
		assertSame(str4, str5);
		
		// Check whether two arrays are equal
		assertArrayEquals(arrayOne, arrayTwo);
		
	}
	
}
