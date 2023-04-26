package com;

import java.util.Scanner;

public class InvalidPassword extends RuntimeException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the user name: ");

		String name = scan.next();
		System.out.print("Enter the Password: ");
		int passwod = scan.nextInt();
		if (name.equals("uppi")) {
			if (passwod == 12345) {
				System.out.println("Login Sucess");
			} else
				try {
					throw new InvalidPassword();
				} catch (Exception e) {
					System.out.println("Invalid password");
				}
		} else {
			try {
				throw new InvalidPassword();
			} catch (Exception e) {
				System.out.println("Invalid user");
			}
		}
	}
}