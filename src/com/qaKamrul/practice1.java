package com.qaKamrul;
import java.util.Scanner;

public class practice1 {

	public void practiceClass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your text: ");
		String msg = sc.nextLine();
		
		int wordCount = 0;
		int spaceCount = 0;
		int punctuationCount = 0;
		
		for (int i = 0; i < msg.length(); i++) {
			
			if(msg.charAt(i) == ',' || msg.charAt(i) == '.' || msg.charAt(i) == ';' || msg.charAt(i) == '!' || msg.charAt(i) == '?' || msg.charAt(i) == '-' || msg.charAt(i) == '/' || msg.charAt(i) == '\"' || msg.charAt(i) == '"' || msg.charAt(i) == '\'' || msg.charAt(i) == ':'){
				punctuationCount++;
			}
			
			if(msg.charAt(i) == ' ') {				
				System.out.println();
				wordCount++;
				spaceCount++;
				i++;
			}
			System.out.print(msg.charAt(i));
		}
		System.out.println("\n\nTotal Number of Words: " + ++wordCount);
		System.out.println("Total Number of Space: " + spaceCount);
		System.out.println("Total Number of Character with Space: " + msg.length());
		System.out.println("Total Number of Character without Space: " + (msg.length()- --wordCount));
		System.out.println("Total Number of Punctuation: " + punctuationCount);
		
		sc.close();
	}
}
