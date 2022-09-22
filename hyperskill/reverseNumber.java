package hyperskill;


// this will only reverse 3 digits, if 4 digits it will not work
public class reverseNumber {
	public static void main(String[] args){
		int value = 9765;
		int first = value%10; //gives you the last digit
		int second = (value%100)/10; //%100 gives you the last 2 digits
		int third = value/100;
		System.out.println(first * 100 + second * 10 + third);
	}	

}
