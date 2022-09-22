
package hyperskill;

//import java.util.Scanner;

//In a template below you have a simple calculator that subtracts, sums, divides, and multiplies the two numbers inside the switch statement. 
//Now, we've decided to upgrade it to perform more complex tasks, such as logarithmic functions. For that, separate methods are a better solution. 
//Let's start with decomposing what we have.
//
//Take a look at the template and decompose operations of the calculator into four methods: subtractTwoNumbers(long a, long b) for subtraction, 
//sumTwoNumbers(long a, long b) for adding, divideTwoNumbers(long a, long b) for integer division and multiplyTwoNumbers(long a, long b) for multiplication. 
//Each method should print the result of calculations.
//
//Note that you can't divide by zero. In case your second argument is zero, you should print the "Division by 0!" message.

//public class SimpleCalculator {
//	// Implement your methods here
//	public static void subtractTwoNumbers(long a, long b){//cannot put return
//		System.out.println(a - b);
//	}


	//	public static void divideTwoNumbers(long a, long b){
	//		if(b <= 0){
	//			System.out.print("Division by 0!");
	//		}else{
	//			System.out.println(Math.toIntExact(a)/Math.toIntExact(b));
	//
	//		}}
	//	
	//	 public static void divideTwoNumbers(int a, int b){
	//	        if(b == 0){
	//	            System.out.print("Division by 0!");
	//	        }else{
	//	            System.out.println(Long.valueOf(a)/Long.valueOf(b));
	//	        }
	//	    }

	//	public static void divideTwoNumbers(long a, long b){
	//        if(b == 0){
	//            System.out.print("Division by 0!");
	//        }else{
	//            System.out.println(a/b);
	//        }
	//    }

	// cannot use ternary on system.out.print
	//	public static void divideTwoNumbers(long a, long b){
	//        if(b == 0) ? System.out.print("Division by 0!"):
	//            System.out.println(a/b);
	//        }
	// only way to solve by ternary is
//	public static void divideTwoNumbers(long a, long b) {
//		System.out.println(b != 0 ? a / b : "Division by 0!");
//	}
//
//
//	public static void divideTwoNumbersTernary(long a, long b) {
//		System.out.println(b == 0 ? "Division by 0!" : a / b);
//	}


	//final String msg = num > 10 
	//? "Number is greater than 10" 
	//: "Number is less than or equal to 10";



//	public static void multiplyTwoNumbers(long a, long b){
//		System.out.println(a * b);
//	}



//Scanner scanner = new Scanner(System.in);
//...
//int password = 76543210;
//String speakersState;
//String lampState;
//String doorState;

// reading the password
//System.out.println("Enter password: ");
//int passwordInput = scanner.nextInt();

// checking if the password is correct
//if (passwordInput != password) {
//    System.out.println("Incorrect password!");
//} else {
    // asking the user what they want to do
//    System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door");
//    String action = scanner.next();
//    
//    switch (action) {
//        case "1":
//            // asking the user about speakers
//            
//            switch (speakersState) {
//                case "on":
//                    // ...
//                case "off":
//                    // ...
//                default:
//                    // ...
//            }
//            break;
//        case "2":
//            // asking the user about lights...
//        case "3":
//            // asking the user about the door...
//        }
 //   Decomposing a program into methods
//}
//}}

//method that turns the music on and off

//public static void controlMusic() {
// Scanner scanner = new Scanner(System.in);
// System.out.println("on/off?");
// String tumbler = scanner.next();
// if (tumbler.equals("on")) {
//     System.out.println("The music is on");
// } else if (tumbler.equals("off")) {
//     System.out.println("The music is off");
// } else {
//     System.out.println("Invalid operation");
// }
//}
//}
