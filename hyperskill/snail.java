package hyperskill;

import java.util.Scanner;

public class snail {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		//int h = scanner.nextInt();
		//int h = 19;
		int h = 20;
		//int a = scanner.nextInt();
		int a = 7;
		//int b = scanner.nextInt();
		int b = 3;
		int feet = 0;
		int days = 0;
		
		while(true) {
			days += 1;
			feet += a;
			if(feet < h) {
				feet -=b;
			}else {
				break;
			}
		}
		System.out.println(days);
	}	}
		