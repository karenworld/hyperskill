package OOP;

public class FixedSizeArray {
	public static void main(String[] args) {
		 int[] a = {3, 0 , 3, 9, 2, 1};
		 int r = 13;
	        r += a[a[0]];
	        r -= a[a[a.length-1]];
	        System.out.println(r);
	}
}
