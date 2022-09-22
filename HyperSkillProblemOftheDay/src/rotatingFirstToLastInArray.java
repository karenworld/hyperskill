import java.util.Arrays;

//1) Create an int[size] array
//2) inside a for loop start saving the int's from the "1" index
//3) after the loop, save the last int in the "0" index of your value's array.
public class rotatingFirstToLastInArray {
	public static void main(String[] args) {
	int[]b = {1, 2, 3, 4, 5};
	System.out.println(Arrays.toString(Rotate(b)));
	}
//	 Sample Input 1:
//
//		 5
//		 1 2 3 4 5
//
//		 Sample Output 1:
//
//		 5 1 2 3 4

	public static int[]Rotate(int[]a){
		int[]newArrayStoringNewArrayAfterRotation = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			int rotatedIndex = (i+1)%a.length;
			newArrayStoringNewArrayAfterRotation[rotatedIndex] = a[i]; 
		}
		return newArrayStoringNewArrayAfterRotation;
	}
	
}