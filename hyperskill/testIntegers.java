package hyperskill;

import java.util.Scanner;

//1. How many feets had made snail before first night ? (A)
//2. How many feets it will add for each subsequent day ? (A-B)
//Just write the sequence of days and solution will not keep you waiting..
public class testIntegers {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // put your code here
	        ////int H = scanner.nextInt();
	        //int H = 10;
	        int H = 20;
	        //int H = 19;
	        //int A = scanner.nextInt();
	       // int A = 3;
	        int A = 7;
	        //int B = scanner.nextInt();
	       //int B = 2;
	        int B = 3;
	      //  if((h>b && a>b) && (h <= 100 && a <= 100 && b <= 100) && (h>=0 && a>=0 && b>=0)) {
	        if(H <= 100 && A <= 100 && B <= 100 && H >= 1 && A >= 0 && B >= 0)
	        //where H > B and A > B
	        if(H > B && A > B){
//	            int result = ((H/A)*(H/B) + 1) - ((H/A) + (H/B));
//	            if(result%2 != 0 ) {
//	        	System.out.println(result);//FAILED test #3	            
//	            	} else {
//	            System.out.println(result + result%2);	
	        	//System.out.print((h - b - 1) / (a - b) + 1);
	            System.out.println((H-B-1)/(A-B)+1);
	         

	        }
	    }}
	    

