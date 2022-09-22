package hyperskill;

//Implement int findIndex(int[] numbers, int value) method 
//
//to search an index of an integer element value among non-negative integer numbers array. 
//If numbers contains several value elements, return the index of the last one. 
//In case there are no value elements in the numbers array, return -1.

public class indexMatchesValue {
	static int findIndex(int[] numbers, int value) {        
		// implement me
		int index = -1;
		int returnIndex = 0;
		for(int i = numbers.length-1; i >= 0; i--)
			if(numbers[i] == value)  {           

				return i;
			}
		return index;        
		
		//alternate way to solving it by updating index with i that met the right condition
//		static int findIndex(int[] numbers, int value) {
//	        int index = -1;
//	        for (int i = 0; i < numbers.length; i++) {
//	            if (value == numbers[i]) {
//	                index = i;
//	            }
//	        }
//	        return index;
//	    }
	}
	//	Test input:
	//		8 11 3 7 5 10 5
	//		5
	//		Correct output:
	//		6
	//
	//		Your code output:
	//		5


	//Test input:
	//8 11 3 7 5 10 5
	//5
	//Correct output:
	//6
	//
	//Your code output:
	//4

	public static void main(String[] args) {
		indexMatchesValue mv = new indexMatchesValue();
		int[]a = {2,5,8,9,9};
		int[]b = {2,5,8,9,9};
		int[]c = {8, 11, 3, 7, 5, 10, 5};
		//search the index
		System.out.println(findIndex(a, 9));
		System.out.println(findIndex(b, 1));
		System.out.println(findIndex(c, 5));
	}
}
