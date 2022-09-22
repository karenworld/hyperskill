package hyperskill;

public class SearchMaxInArray {
	

//    Suppose the number with the index 0 (the first element) is a candidate to be the maximum.
//    In the loop, we take the following number of the array (from the second to the last one), while the end of the array is not reached and do (3), otherwise, go to (5).
//    If the taken number is greater than the candidate, save its index (found a new candidate).
//    Go to the following iteration (2).
//    Return the index of a found candidate.

	
	public static int findIndexOfMax(int[] numbers) {
//		Corner case is a situation that occurs when an algorithm's input values may lead to incorrect or ambiguous behavior. 
//		Considering corner cases is an important part of designing algorithms.
//
//		Let's return to our example algorithm. It may seem like it works well. 
//		But what if the array contains several numbers that are equal to the maximum? Also, what if the array is empty?
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
	
	public static void main(String[] args) {
		int[]a = {5,6,7,9,1};
		System.out.println(findIndexOfMax(a));
	}
}
