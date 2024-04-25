package com.coding;

public class Array__Sum_2 {

	public static void main(String[] args) {
		  int[] numericArray = {5, 2, 9, 1, 7};
	        int sum = 0;
	        for (int i = 0; i < numericArray.length; i++) {
	            sum = sum +numericArray[i];
	        }
	        System.out.println("Array sum :"+sum);
	}

}
