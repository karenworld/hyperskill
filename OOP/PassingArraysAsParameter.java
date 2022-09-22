package OOP;

import java.util.Arrays;

public class PassingArraysAsParameter {
	
	public static void main(String[] args) {
		
		int[] numbers = { 4, 5, 6 };
        int [] xyz = new int[]{ 8,9,10};
        int [] numberxyz = {3,4,5};
		playMethod(numbers);
		playMethodALT(xyz);
		playMethodALT(numberxyz);
		
		System.out.println(Arrays.toString(numbers));//print 1 2 3
		System.out.println(Arrays.toString(xyz));//print 8 9 10
		System.out.println(Arrays.toString(numberxyz));// 3 4 5
	}
	
	public static void playMethod(int[] array) {
	    if (array.length >= 3) {
	        array[0] = 1;
	        array[1] = 2;
	        array[2] = 3;
	    }
	}
	
	public static void playMethodALT(int[] array) {
		int n = 3;
		array = new int[3];
	    if (array.length >= 3) {
	        array[0] = 1;
	        array[1] = 2;
	        array[2] = 3;
	    }
	}
}
