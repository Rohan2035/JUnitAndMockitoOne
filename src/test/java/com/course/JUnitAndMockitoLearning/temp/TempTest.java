package com.course.JUnitAndMockitoLearning.temp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TempTest extends TestCase {
	
	private int num1, num2;
	
	@Before
	public void setUp() {
		
		num1 = 0;
		num2 = 1;
		
	}
	
	@Test
	public void testUnitOne() {
		
		// No. of test cases
		System.out.println("Number of test cases: " + this.countTestCases());
		
		// Name of the test case
		System.out.println("Name of the test case: " + this.getName());
		
		// Set new name to the test case
		this.setName("MyTempTest");
		System.out.println("New name for the test case: " + this.getName());
		
	}
	
	public void tearDown() {}

}
