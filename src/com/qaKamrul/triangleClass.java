package com.qaKamrul;

public class triangleClass {

	public void triangle() {
		
		//Right Half Triangle
		String star = "*";
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(star);
			star += '*';
		}
		System.out.println(" ");
		
		//Left Half Triangle
		star = "*";
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(star);
			star += "*";
		}
		System.out.println(" ");
		
		//TRIANGLE
		star = "*";
		int m = 1;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(star);
			for (int k = 1; k <= 2; k++) {
				star += "*";
			}
		}
		System.out.println(" ");
		
		//DIAMOND
		star = "*";
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(star);
			for (int k = 1; k <= 2; k++) {
				star += "*";
			}
		}
		star = "*";
		int z = 7;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = z; k > 1; k--) {
				star += "*";
			}
			z -= 2;
			System.out.println(star);
			star = "*";
		}
	}
}
