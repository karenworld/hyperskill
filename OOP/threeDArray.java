package OOP;

import java.util.Arrays;

public class threeDArray {
	public static void main(String[] args) {
		createCube();
	}
	   public static int[][][] createCube() {
	        // write your code here
	       // Scanner scanner = new Scanner(System.in);
	        //int n = scanner.nextInt();
		   //initialize 3-d array
	      //  int[][][] intArray = { { { 1, 2, 3 }, { 4, 5, 6 } },  { { 1, 4, 9 }, { 16, 25, 36 } },
	                //{ { 1, 8, 27 }, { 64, 125, 216 } } }; 
	       // int[][][] intArray = new int[3][3][3];
		   // Just loop through 3d array using three for loops and increment the counter, don't forget to reset the counter in the outer loop.
	        int[][][] intArray =	{{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}}};
	        //arr[i][j][k] = k + (n * j)
//	        int row = 3;
//	        int col = 3;
//	        int height = 3;
//	        int[][][] intArray = new int[row][col][height];
	        for (int i = 0; i < intArray.length; i++) {
	            for (int j = 0; j < intArray[i].length; j++) {
	                for (int z = 0; z < intArray[i][j].length; z++) {
	                    System.out.print(intArray[i][j][z] + "\t");	              
	                 
	                }	                
	                System.out.println();	                
	            }
	            System.out.println();
	            
	        }
	        return intArray;
	    }
	}

