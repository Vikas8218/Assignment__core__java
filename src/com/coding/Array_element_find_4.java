package com.coding;

public class Array_element_find_4 {

	public static void main(String[] args) {
		        int[] array = {1, 5, 7, 9, 3};
		        int elementToFind = 9;
		        int index = -1;
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] == elementToFind) {
		                index = i; 
		                break; 
		            }
		        }

		        if (index != -1) {
		            System.out.println("Index of " + elementToFind + " is: " + index);
		        } else {
		            System.out.println("Element " + elementToFind + " not found in the array.");
		      }
	   }
}
