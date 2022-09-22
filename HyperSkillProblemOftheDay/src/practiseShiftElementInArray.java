import java.util.Arrays;

public class practiseShiftElementInArray {
	public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(secondLastToFirst(x)));
        System.out.println(Arrays.toString(lastToFirst(x)));
      
	}
	
	
	
	
	public static int[] lastToFirst(int[]a){
		int temp = a[a.length-1];
		for(int i = a.length-1; i >=1; i--) {
			a[i] = a[i -1]; // to indicate the index will start from 0, thus i >= i and then use a[i -1]
		}
		a[0] = temp; //to indicate that it will start with the last digit first
		return a;
	}
	
	
	//doesn't work..this algorithm is wrong
	public static int[] secondLastToFirst(int[]b) {
		int temp = b[b.length-2];
		for(int i = b.length-2; i >= 2; i--) {
			b[i] = b[i-2];
		}
		b[0] = temp;
		return b;
	}	
}
