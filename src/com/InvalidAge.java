package com;

public class InvalidAge extends Exception {
	String message;

	public InvalidAge(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
