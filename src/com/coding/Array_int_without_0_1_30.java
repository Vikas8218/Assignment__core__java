package com.coding;

public class Array_int_without_0_1_30 {
	    public static boolean checkArray(int[] array) {
	        for (int num : array) {
	            if (num == 0 || num == -1) {
	                return false;
	            }
	        }
	        return true;
	    }
	
public static void main(String[] args) {
    int[] array1 = {1, 3, 4, 2}; 
    int[] array2 = {0, 2, -1, 3}; 

    System.out.println("Array 1: " + (checkArray(array1) ? "contains only values other than 0 and -1" : "contains 0 or -1"));
    System.out.println("Array 2: " + (checkArray(array2) ? "contains only values other than 0 and -1" : "contains 0 or -1"));
}


}