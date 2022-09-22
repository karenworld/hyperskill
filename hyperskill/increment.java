package hyperskill;

public class increment {
	
	public static void incrementPractice() {
	int a = -1;
	System.out.println(1 - a++);// 1-(-1) = 2
	System.out.println("a++ = " + a++);
	}
	
	//expressions are evaluated left to right.
	//The left hand 'a' has a value of 4. 
	//when the second 'a' is evaluated it is now 5 since the increment is an atomic action. Hence result = 4 + 5 = 9.
	public static void incrementPractice1() {
	int a = 4;
    System.out.println(a++ + a); // this is 9 - > 5 + 4
	}
	
	public static void incrementPractice2() {
	int a = 300;
	int b = a++;
	int c = --b; // --b is only -1
	System.out.println(c); // 299 
	}
	
	public static void incrementPractice3() {
		int n = 0;
		System.out.print(++n); //note: not println, but print so it will print on the same line
		System.out.print(n++);
		System.out.print(n++);		
		}
	
	
	public static void main(String[] args) {
	
		incrementPractice();
		incrementPractice1();
		incrementPractice3();
	}
}

//output result
//2
//9