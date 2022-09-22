//Given a sequence of natural numbers. For each number of the sequence output "even" if the number is even, otherwise, "odd". If the number is equal to 0, the program must stop reading and processing numbers.
//
//Input data
//
//A sequence of natural numbers, each number in a new line.
//
//Output data
//
//The sequence of words "even" and "odd". Each word in a new line.
//
//Output the result right after the number is entered. 
//Then input the next one. There's no need to store the sequence.

public class printEvenOddSequentially {

	public static void main(String[] args) {
		int[]array = {1,2,3,4,0};
		int a = 1;
		System.out.println(printEvenOdd(array));
		System.out.println(printEvenOdd(a));
	}

	public static String printEvenOdd(int[]a){
		String message = "";
		for(int i = 0; i < a.length; i++) {
			while(a[i] == 0) {
				break;
			}
			if(a[i]%2 == 0) {
				System.out.println("Even");
				//message = "Even";
			}else if(a[i] == 0) {
				break;
			}else {	
				System.out.println("Odd");
				//message= "Odd";
			}
		}
		//}
		return message;
	}


	public static String printEvenOdd(int a) {
		String message = "";
		while (a == 0) {
			break;
		}
		if (a%2 == 0) {
			System.out.print("Even");
		}else {
			System.out.println("Odd");
		}		
		return message;
	}
}

//Given a four-digit number. Determine whether its decimal notation is symmetric. 
//If the number is symmetric, output 1; otherwise output any other integer.


//import java.util.Scanner;
//import java.lang.Math;
//
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();    
//    int rev = 0;    
//    int digit = n%10;
//    n = n/10;
//    
//    if(rev == n%10){
//        System.out.println("1");
//    }else{
//        System.out.println(Math.random());
//    }
//    }
//}

