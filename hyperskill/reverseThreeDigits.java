package hyperskill;

import java.util.Scanner;

public class reverseThreeDigits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 320;
        int res = 0;
        int rem = 0;
        while( num!= 0) {    	   	
    	rem=num%10;
    	res=(res*10)+rem;
    	num=num/10; 
		}
        System.out.print("the reverse no is " + res);
        }
}
			
        
       

