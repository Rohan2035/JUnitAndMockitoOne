package com.course.JUnitAndMockitoLearning;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.course.JUnitAndMockitoLearning.message.MessageUtilTest;
import com.course.JUnitAndMockitoLearning.primeNumbers.PrimeNumberCheckerTest;
import com.course.JUnitAndMockitoLearning.temp.TempTest;
import com.course.JUnitAndMockitoLearning.temp.TempTestThree;
import com.course.JUnitAndMockitoLearning.temp.TempTestTwo;

public class TestRunner {

	public static void main(String[] args) {

//		Result result = JUnitCore.runClasses(MessageUtilTest.class);
		
//		Result result = JUnitCore.runClasses(TempTest.class);
		
//		Result result = JUnitCore.runClasses(TempTestTwo.class);
		
//		Result result = JUnitCore.runClasses(TempTestThree.class);
		
		Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);

		for (Failure failure : result.getFailures()) {

			System.out.println(failure);

		}

		System.out.println(result.wasSuccessful());

	}

}
