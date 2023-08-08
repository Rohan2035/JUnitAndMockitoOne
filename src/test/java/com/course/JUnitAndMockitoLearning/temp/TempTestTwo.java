package com.course.JUnitAndMockitoLearning.temp;

import org.junit.Test;

import junit.framework.TestResult;

public class TempTestTwo extends TestResult {
	
	public synchronized void addError(Test test, Throwable throwable) {
		
		super.addError((junit.framework.Test) test, throwable);
		
	}
	
	public synchronized void addFailure(Test test, Throwable throwable) {
		
		super.addError((junit.framework.Test) test, throwable);
		
	}
	
	@Test
	public void testAdd() {
		
		
		
	}
	
	public synchronized void stop() {
		
		
		
	}

}
