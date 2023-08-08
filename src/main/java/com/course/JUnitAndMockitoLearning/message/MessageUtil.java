package com.course.JUnitAndMockitoLearning.message;

public class MessageUtil {
	
	private String message;
	
	MessageUtil(String message) {
		
		this.message = message;
		
	}
	
	public String getMessage() {
		
		System.out.println("Message: " + this.message);
		
		return message;
		
	}

}
