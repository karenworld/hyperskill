import java.util.Arrays;

public class ThreeDimensionDemo {
	public static void main(String[] args) {		

	int element = 0;
	int[][][] threeDArray = new int[2][3][4];	
	for (int i = 0; i < threeDArray.length; i++) {
	    for (int j = 0; j < threeDArray[i].length; j++) {
	        for (int k = 0; k < threeDArray[i][j].length; k++) {
	            threeDArray[i][j][k] = element;
	        }
	        element++;
	    }
	}
	for (int i = 0; i < threeDArray.length; i++) {
	    for (int j = 0; j < threeDArray[i].length; j++) {
	        System.out.print(Arrays.toString(threeDArray[i][j]) + " ");
	    }
	    System.out.println();
	//print();
	}
	}
	
	
	public static void print(	int[][][] threeDArray) {	
	for (int i = 0; i < threeDArray.length; i++) {
	    for (int j = 0; j < threeDArray[i].length; j++) {
	        System.out.print(Arrays.toString(threeDArray[i][j]) + " ");
	    }
	    System.out.println();
	}
}}
