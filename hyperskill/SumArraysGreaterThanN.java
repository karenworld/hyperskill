package hyperskill;

//public class SumArraysGreaterThanN {
//
//	public static void main(String[] args) {
//		// put your code here
//
//		int[] n = { 5, 8, 11, 2, 10 };
//		System.out.println(SumGreaterThanN(n, 8));
//	}

//	Write a program that reads an array of ints and an integer number n. 
//	The program must sum all the array elements greater than n.
//	public static int SumGreaterThanN(int[]arr, int value){
//		int sum =0;		
//		for (int i = 0; i < arr.length; i++){
//				if(arr[i] > value)				
//				//sum = sum + arr[i];
//				sum += arr[i];
//		}
//		return sum;
//	}
//	
//	//alternate solution
//	class Main {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        //read the length of the array
//	        int length = scanner.nextInt();
//	        //reads elements
//	        int[] inputData = new int[length];
//	        for (int i = 0; i < length; i++) {
//	            inputData[i] = scanner.nextInt();
//	        }
//	        int limit = scanner.nextInt();
//	        //computation : sum of all element > limit
//	        long sum = 0;
//	        for (int i : inputData) {
//	            if (i > limit) {
//	                sum += i;
//	            }
//	        }
//	        System.out.println(sum);
//	    }
//	
	
	//class Main {
	  ///  public static void main(String[] args) {
	       // Scanner scanner = new Scanner(System.in);

	        //System.out.println("Enter a number: ");
	    //    int n = scanner.nextInt();
	     //   int[] numbers = new int[n];
	        //System.out.println("Now enter " + n + " numbers");

	   //     int i = 0;
	     //   while (i < n) {
	      //      numbers[i] = scanner.nextInt();
	       //     i++;
	      //  }

	       // System.out.println("Your numbers are " + Arrays.toString(numbers));

	       // System.out.println("Enter a number from which I should count: ");
//	        int fromNumber = scanner.nextInt();
//
//	        int sum = 0;
//
//	        for (int c = 0; c < n; c++) {
//	            if (numbers[c] > fromNumber) {
//	                sum += numbers[c];
//	            }
//	        }
//	        System.out.println(sum);
//	    }
//	}
	
//	correct solution - using for-easch as second loop
//	class Main {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        int arrayLen = scanner.nextInt();
//	        int[] array = new int[arrayLen];
//
//	        for (int i = 0; i < arrayLen; i++) {
//	            array[i] = scanner.nextInt();
//	        }
//	        int n = scanner.nextInt();
//	        int sum = 0;
//	        for (int i : array) {
//	            if (i > n) {
//	                sum += i;
//	            }
//	        }
//	        System.out.println(sum);
//	    }
//	}








