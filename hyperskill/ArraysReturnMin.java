package hyperskill;

import java.util.Scanner;

//Write a program that reads an array of integers and finds the minimum value of the array.
//
//Input data format
//
//The first line contains the size of an array.
//The second line contains elements of the array separated by spaces.
//
//Output data format
//
//An integer number representing the minimum in the input array.


//Step 1 – Initialize integers min and len
//Step 2 – Accept the length of the array 
//Step 3 – Initialize an array.
//Step 4 – Accept the input, using for loop.
//Step 5 – Store the first element of the array in min.
//Step 6 – Compare all the elements of the array with min, and use a if condition for comparing all the array elements with min.
//Step 7 – If there’ll be any element smaller than min, store it value in min.
//Step 8 – Print min.

public class ArraysReturnMin {
	public static void main(String[] args) {
		int min =Integer.MAX_VALUE;
		int[]n = {5, 1, 4, 2, 3};
		for(int c: n) {
	        min=c<min?c:min;
	        }
		
		System.out.println(min);// 1 - correct
		//		for (int i = 0; i < input.length; i++) {
		//		     input[i] = s.nextInt();
		//		}

		//int result = IntStream.of(input).min().orElse(Integer.MAX_VALUE);
	}
}


