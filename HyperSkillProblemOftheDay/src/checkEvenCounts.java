
public class checkEvenCounts {
	public static void main(String[] args) {
		int[]a = {1,4,8};
		int[]b = {3,8,8};
		int[]c = {1,2,4};
		int[]d = {7,5,3};
		int[]e = {4,4,4};
		System.out.println(countEven(a));//2
		System.out.println(countEven(b));
		System.out.println(countEven(c)); //2%4 = 2(note : multiplier of 4 is 0,4 and since 2 is less than 4 so the answer is 2)
		System.out.println(countEven(d)); // 5 divide by 4 left 1.3 mod 4 is 3.// and the count is 0 since there is no even no.
		System.out.println(countEven(e));
	}
	
	
	
	public static int countEven(int[] numbers) {
	    int count = 0;

	    for (int i = 1; i < numbers.length; i++) {
	        if (numbers[i] % 4 == 0) {
	            count++;
	        }
	    }

	    return count;
	}
	
}
