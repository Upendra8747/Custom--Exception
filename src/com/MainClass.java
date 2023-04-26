package com;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scan.nextInt();

		if (age >= 21) {
			System.out.println("Get married soon");
		} else {
			try {
				throw new InvalidAge("Wait boiii");

				
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}