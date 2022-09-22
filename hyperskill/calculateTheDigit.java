package hyperskill;

public class calculateTheDigit {
	public static void main(String[] args){
	int number = 12241;
	int digit = ((number % 100) / 10) % 10;
	System.out.println(digit);
}}

// note : 12241%100 will give you 41 
// 41/10 will give you 4.1
// 4.1 %10 will gives you 4