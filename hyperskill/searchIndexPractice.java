package hyperskill;

import java.util.Arrays;

public class searchIndexPractice {
	//	public static int searchInSubArray(int[] numbers, int startIndex, int endIndex, int value) {
	//        // write your code here
	//        for(int i = 0; i < numbers.length; i++){
	//            if(numbers[i] == value){
	//                return numbers[i];
	//            }else{
	//                return -1;
	//            }
	//        }
	//		return value;
	//    }

	//	
	//	Implement a method to search the index of the first occurrence of a given value in a range of indexes in a given array. The start index should be inclusive and the end index exclusive. If they are equal, suppose the element is not found.
	//
	//	If the value is not found, the method must return -1.
	//
	//	It's guaranteed that startIndex <= endIndex and the array is not empty.

	public static int searchInSubArray(int[] numbers, int startIndex, int endIndex, int value) {
		int index = -1;
		// write your code here
		
//				1. check start index bounds should be 0 <= startIndex < numbers array length
//				2. while startIndex is less than numbers arrays length and less then endIndex
//				2.1 check if numbers at index startIndex equal to the value
//				true? return startIndex
//				else increment startIndex by one
//				3. value hasn't been found between startIndex and endIndex, return -1
		
		for(int i = startIndex; i < numbers.length && i < endIndex-1; i++){ 
				if(numbers[i] == value){
					index = i;
					break;
				}else if (numbers[i] > value ) {
					break;
				}
		}
		return index;
	}

	//O is inclusive, 2 is exclusive so indices (2-1) where you search

	/* Do not change code below */
	public static void main(String[] args) {
		int[]n = {19, 14, 17, 15, 17};
		int[]n1= {21, 83, 14, 29, 55, 18};
		System.out.println(searchInSubArray(n,2, 5, 17));
		System.out.println(searchInSubArray(n,0, 2, 17));
		System.out.println(searchInSubArray(n,0, 6, 18));// failed test 8 of 19
	}}

