package hyperskill;

import java.util.Arrays;

public class searchIndex {
	
	public static void main(String[] args) {
		int[]n = {1,4,5,2,3};
		//System.out.println(search(n, 2));
		//System.out.println(search(n, 8));
		System.out.println(searchInSortedArray(n,2));
	}
	
	public static int search(int[] array, int value) {
	    int index = -1; // not found
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == value) {
	            index = i;
	            break;
	        }
	    }
	    return index;
	}
	
	public static int searchInSortedArray(int[] array, int value) {		
	    int index = -1;
	    for (int i = 0; i < array.length; i++) {
	    	Arrays.sort(array);
	        if (array[i] == value) {
	            index = i;
	            break;
	        } else if (array[i] > value) {
	           break;
	        }
	    }
	    return index;
	}
}
