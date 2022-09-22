import java.util.Arrays;

public class cyclicRotation {
//	public int[]solution(int[]A, int k){
//		int[]rotate = new int[A.length];
//			for(int i = 0; i < A.length; i++) {
//			int rotatedIndex = (i+k)%A.length;
//			rotate[rotatedIndex] = A[i];
//		
//			System.out.println("the rotate " + rotate[rotatedIndex]);
//		}
//		return rotate;
//		
//	}
	
	public int[]solution(int[] input){
//		int elementToReturn = A.length - k;
//		for(int i = 0; i < A.length; i++) {
//			System.out.println(elementToReturn + A[i]);
//		}
//		return A[elementToReturn] + A[i];
		int tmp = input[input.length-2];
	    for(int i = input.length-2; i > 1; --i)
	    {
	        input[i] = input[i-2];
	    }
	    input[0] = tmp;
	    return input;
	}
	
	public int[]solutionAlternate(int[] A, int k){
		int elementToReturn = A.length - k;
		for(int i = 0; i < A.length; i++) {
			System.out.println(elementToReturn + A[i]);
		}
		return A;
		
//		int tmp = input[input.length-1];
//	    for(int i = input.length-1; i > 0; --i)
//	    {
//	        input[i] = input[i-1];
//	    }
//	    input[0] = tmp;
//	    return input;
	}
	
	
	public static void main(String[] args) {
		cyclicRotation c = new cyclicRotation();
		int[]arr = {3,4,2,1};
		int k = 1;
		System.out.println(Arrays.toString(c.solution(arr)));
		//System.out.println(Arrays.toString(c.solutionAlternate(arr, k)));
	}
}
