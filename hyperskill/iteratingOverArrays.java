package hyperskill;

import java.util.Arrays;
import java.util.Scanner;

public class iteratingOverArrays {

	public static void main(String[] args) {


		int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

		boolean broken = false; // suppose the array is well-ordered

		/* iterating over the array */
		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < numbers[i - 1]) { // if the order is broken
				broken = true; // write a result
				break;         // terminate the loop
			}
		}

		if (broken) {
			System.out.println("BROKEN");
		} else {
			System.out.println("OK");
		}

	
	
	//reading an array from scan input
	Scanner scanner = new Scanner(System.in);
    
	int len = scanner.nextInt(); // reading a length
	int[] array = new int[len];  // creating an array with the specified length
	        
	for (int i = 0; i < len; i++) {
	    array[i] = scanner.nextInt(); // read the next number of the array
	}

	System.out.println(Arrays.toString(array)); // output the array

	
	//for-each loop
	//Using loops is a convenient way to process an array of elements. 
	//You can perform various algorithms, iterate an array and read in from the standard input with a loop. 
	//A form of for-loop called for-each is commonly used to iterate through each element of an array, string, or collection without the elements' indices. 
	//There are some limitations to its use, but it makes the code more readable and allows to avoid the ArrayIndexOutOfBoundsException.
	char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

	int counter = 0;
	for (char ch : characters) {
	    if (ch == 'a') {
	        counter++;
	    }
	}

	System.out.println(counter); // it outputs "3"

	//another way of doing it
	char[] chars = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

	int count = 0;
	for (int j = 0; j < chars.length; j++) {
	    if (chars[j] == 'a') {
	        count++;
	    }
	}

	System.out.println(count); // it outputs "3"

}
}
