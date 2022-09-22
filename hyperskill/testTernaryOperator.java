package hyperskill;

import java.util.Scanner;

public class testTernaryOperator {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		if ( i < 10000) {
//			if(i%2 == 0) {
//				System.out.println(i+2);				
//			}else {
//				System.out.println(i+1);
//			}
			int result = i % 2 == 0 ? i + 2 : i + 1 ;//need to put in variable int result
		System.out.println(result);
		}
	}

}
