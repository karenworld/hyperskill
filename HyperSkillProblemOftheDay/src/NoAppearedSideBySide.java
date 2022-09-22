// Sample Input 1:
//
//3
//1 3 2
//2 3
//
//Sample Output 1:
//
//true


//The third line contains two integer numbers n and m.
public class NoAppearedSideBySide {
	public static void main(String[] args) {
		int[] array = {1,3,2};
		int[] arrayTocheck = {2,3};
		findNumber(array,arrayTocheck);
	}
	
	//int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

	public static void findNumber(int[]numbers, int[]noToCheck) {
	boolean broken = false; // suppose the array is well-ordered
	/* iterating over the array */
	for (int i = 0; i < numbers.length; i++) {	    
		for(int j = 0; j < noToCheck.length; j++) {			
		if(numbers[i] == noToCheck[i])
		broken = true;
	    if (numbers[i+1] < noToCheck[i + 1]) { // if the order is broken
	        broken = true; // write a result
	        break;         // terminate the loop
	    }
	}
	if (broken) {
	    System.out.println("BROKEN");
	} else {
	    System.out.println("OK");
	}
}
	}}
