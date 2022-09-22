import java.util.Arrays;

public class CyclingElement {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4, 5, 6 };
		x = shiftArray(x, x.length-1);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}


	public static int[]firstToLast(int[]a){
		int temp = a[0];
		for(int i = 0; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
		a[a.length -1] = temp;

		return a;
	}

	public static int[]shiftArray(int[]x, int pos){
		for(int i = pos -1; i >= 0; i--) {
			x = firstToLast(x);
		}
		return x;
	}
}