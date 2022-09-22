import java.util.Scanner;

public class AddUpsTwenty {
	public static void main(String[] args) {
		 //Scanner scanner = new Scanner(System.in);
	        // put your code here
	        int a = 2;
	        int b = 18;
	        int c = 10;
//	        if ((a + b == 20) || (a + c == 20) || (b + c ==20)){
//	            System.out.println(true);
//	        }else {
//	        	System.out.println(false);
//	        }
	        boolean if20 = a + b == 20 || a + c == 20 || b + c == 20;

	        System.out.println(if20);
	    }
	}

// other people's solution
//int firstNumber = scanner.nextInt();
//int secondNumber = scanner.nextInt();
//int thirdNumber = scanner.nextInt();
//int fsSum = firstNumber + secondNumber;
//int stSum = secondNumber + thirdNumber;
//int tfSum = thirdNumber + firstNumber;
//boolean fsaddsToTwenty = fsSum ==  20;
//boolean staddsToTwenty = stSum ==  20;
//boolean tfaddsToTwenty = tfSum ==  20;
//boolean addsToTwenty = fsaddsToTwenty || staddsToTwenty || tfaddsToTwenty;
//System.out.println(addsToTwenty);
//	

//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        boolean if20 = a + b == 20 || a + c == 20 || b + c == 20;
//
//        System.out.println(if20);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> nums = new ArrayList<>();
//        while (scanner.hasNextInt()) {
//            nums.add(scanner.nextInt());
//        }
//        int a = nums.get(0);
//        int b = nums.get(1);
//        int c = nums.get(2);
//        System.out.println(a + b == 20 || a + c == 20 || b + c == 20);
//    }
//}

