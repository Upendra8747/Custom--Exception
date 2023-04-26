package com;

class MyException extends RuntimeException {
	String message;

	MyException(String name) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}

public class MainClass1 {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			if (y == 0) {
				throw new MyException("Can't divided by zero");
			}
		} catch (MyException e) {
			e.getMessage();
		}
	}
}
