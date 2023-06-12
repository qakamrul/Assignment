package com.qaKamrul;

public class playWithArray {
	
	public void playArray() {
		
		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[arr1.length];
		
		System.out.print("Array 1: ");
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			
			System.out.print(arr1[i] + ",");
		}
		
		//print array2
		System.out.print("\nArray 2 (Copy of Array 1): ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ",");
		}
		
		//Reverse Array
		System.out.print("\nReverse Array: ");
		for(int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i] + ",");
		}
	}
}
