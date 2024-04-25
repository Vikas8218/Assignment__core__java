package com.coding;

public class Average_value_array_5 {

	public static void main(String[] args) {
		        int[] numbers = {70, 60, 80, 90, 95};
		        int sum = 0;
		        for (int i = 0; i < numbers.length; i++) {
		            sum = sum + numbers[i];
		        }
		        double average = sum / numbers.length;
		        System.out.println("Average value of the array elements is : " + average); 
		    }
		
	}


