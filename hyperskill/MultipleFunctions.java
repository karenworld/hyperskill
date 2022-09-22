package hyperskill;

import java.util.Scanner;

public class MultipleFunctions {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		double x = scanner.nextDouble();
//		double b = 0.0;
		System.out.println(f(0.5));	
	}

	public static double f(double x){
		if(x > 0 && x < 1){
			return f1(x);
		}else if (x <= 0)
			return f2(x);

		else if(x >= 1){
			return f3(x);
		}
		return x;
	}
	
//	public static double f(double x) {
//		double b = 0;
//		switch(b) { // what should be inside the switch?
//		case "A":
//			f1(x);
//		break;
//		case "B":
//			f2(x);
//		break;
//		case "C":
//			f3(x);
//		}
//	}


	public static double f1(double x) {
		//call your implemented methods here. 
//		if (x > 0 && x < 1) {
//			x = 1/Math.pow(x,2);
//		}
		x = 1/Math.pow(x,2);
		return x;
	}   


	//implement your methods here
	public static double f2(double x){
		//i/f(x <= 0){
			x = Math.pow(x,2) + 1;
		
		return x;
	}

	
	//implement your methods here
		public static double f2Refactored(double x){
			//i/f(x <= 0){
		return Math.pow(x,2) + 1;		
		
		}
	
	public static double f3(double x){
		//if(x >= 1){
			x = Math.pow(x,2) - 1;
		
		return x;
	}
}

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (x >= 1) {
            return f3(x);
        } else {
            return f2(x);
        }
    }

    //implement your methods here
    public static double f1(double x) {
        return x * x + 1;
    }

    public static double f2(double x) {
        return 1 / x / x;
    }

    public static double f3(double x) {
        return x * x - 1;
    }
}

