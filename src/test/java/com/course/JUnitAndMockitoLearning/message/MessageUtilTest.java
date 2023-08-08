package com.course.JUnitAndMockitoLearning.message;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MessageUtilTest {
	
	String message = "Rohan";
	MessageUtil messageUtil = new MessageUtil("Rohan");
	
	
	@Test
	public void testOne() {
		
		assertEquals(messageUtil.getMessage(), message);
		
	}

}
