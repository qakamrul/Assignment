package com.qaKamrul;
import java.util.Scanner;

public class classMain {

	public static void main(String[] args) {
		
		int userInput = 0;
		System.out.println("1 - See triangle");
		System.out.println("2 - String & count");
		System.out.print("Enter related number & press Enter: ");
		
		Scanner sc = new Scanner(System.in);
		userInput = sc.nextInt();
		
		switch (userInput) {
		
		case 1:
			System.out.println("\nWelcome to Triangle Class:");
			
			triangleClass triangle = new triangleClass();
			triangle.triangle();
			break;
			
		case 2:
			System.out.println("\nWelcome to String Class: ");
			
			practice1 prac = new practice1();
			prac.practiceClass();
			break;
		}

	}

}
