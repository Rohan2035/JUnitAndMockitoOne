package com.course.JUnitAndMockitoLearning;

import com.course.JUnitAndMockitoLearning.temp.TempTest;
import com.course.JUnitAndMockitoLearning.temp.TempTestTwo;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JUnitTestSuite {
	
	public static void main(String[] args) {
		
		TestSuite testSuite = new TestSuite(TempTest.class, TempTestTwo.class);
		TestResult result = new TestResult();
		
		testSuite.run(result);
		
		System.out.println("Number of test cases: " + result.runCount());
		
	}

}
