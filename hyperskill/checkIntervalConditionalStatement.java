package hyperskill;

import java.util.Scanner;

//Given an integer as an input, print True if 
//its value falls within the interval (−15,12]∪(14,17)∪[19,+∞). 
//Otherwise, print False (case sensitive).
//(x, y) == x < a < y;
//[x, y] == x <= a <= y;
//[x, y) == x <= a < y;
//(x, y] == x < a <= y;
//About u: "A ∪ B means the set of those elements which are either in A, "
//		+ "or in B, or in both"
//
//Notes:
//
//    numbers denoted with a parenthesis () are exclusive;
//    numbers denoted with a square bracket [] are inclusive.
//Sample Input 1:
//20
//Sample Output 1:
//True
//Sample Input 2:
//-20
//Sample Output 2:
//False
//result = condition ? trueCase : elseCase;

//public class checkIntervalConditionalStatement {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int x = scanner.nextInt();
//		
//		System.out.println(f(0.5));	
//	}
//	
//	
//	public boolean checkInterval(int a) {
//	
//		return a >=17 && a <=14,  a > -15 && a <= 12 ? true : false;
//		
//	}
//	
//	
//}
