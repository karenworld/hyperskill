package hyperskill;

import java.util.Arrays;

public class Search {
	public static int findIndexOfMax(int[] numbers) {
		if (numbers.length == 0) {
		    return -1;
		}
	    int index = 0;
	    for (int i = 1; i < numbers.length; i++) {
	        if (numbers[i] > numbers[index]) {
	            index = i;
	        }	   
	    }
	    return index;
	}
	
	
	public void printArray(int[]arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int []n = {1, 5, 3, 2, 3};
		//System.out.println(findIndexOfMax(n.toString()));
		//System.out.println(findIndexOfMax(new int[] {1, 5, 3, 2, 3})); // 1
		System.out.println(findIndexOfMax(n));
	}
}
