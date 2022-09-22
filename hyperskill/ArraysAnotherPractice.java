package hyperskill;

import java.util.Scanner;

public class ArraysAnotherPractice {

//	public static void main(String[] args) {
//		// put your code here
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int count = 0;
//		int[]arrays = new int[n];
//		for(int i = 0; i < n; i++){
//			arrays[i] = scanner.nextInt();
//		}
//		int valueOccur = scanner.nextInt();
//		for(int i : arrays){
//			
//			if (i == valueOccur){// cannot use arrays[i] == valueOccur
//				count += 1;  
//			}
//		}
//		System.out.println(count);
//	}
	
	//The first line contains the size of the input array.
	//The second line contains elements of the array separated by spaces.
	//The third line contains n.
	
	public static void main(String[] args) {
		// put your code here
		int count = 0;
		//int[]arrays = new int[6];
		int[]arrays = {1, 2, 3, 4, 2, 1};
		for(int i = 0; i < arrays.length; i++){		
		//int valueOccur = scanner.nextInt();
		int value = 2;
			
			if (arrays[i] == value){
				count += 1;  
			}
		}
		System.out.println(count);
	}
	}



