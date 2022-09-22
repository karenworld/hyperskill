import java.util.Arrays;
import java.util.stream.IntStream;

public class print2DArrayslikeATable {

	public static void main(String[] args) {	

		
//		Theory will not help you solve this problem. What you need to do is:
//			1. Create first array with 2 for loops and scanner all the inputs.
//	
		//2. After that, create second 2 for loops and there you can choose 2 ways:
//			  2.1 add values from first array to new array and then print 
//			  2.2 or print instantly without saving to new array.
//			3. Formula is this: arr[j][n - 1 - i]
		
		 int twoDimArray[][] =			{{	11, 12, 13, 14},
         									{21, 22, 23, 24},
         									{31, 32, 33, 24}};
         									//output
//         									31 21 11 
//         									32 22 12 
//         									33 23 13 
//         									34 24 14 	
//		printMatrix(twoDimArray); 
//		System.out.println("output 2 is: ");
		//printing 2d array clockwise
		
		int[][] matCW = rotateCW(twoDimArray);
	    printMatrix4(matCW);
//		rotateCW(twoDimArray);
	    System.out.println("2nd solution:");
	    flip2DArrays(twoDimArray);
		//rotateClockwise(twoDimArray);//doesn't work
		//printMatrix4(twoDimArray);
	}

//		Try to figure out indexes of the new array:
//			[i=2, j=0] [i=1,j=0] [i=0,j=0]
//			[i=2, j=1] [i=1,j=1] [i=0,j=1]
//			[i=2, j=2] [i=1,j=2] [i=0,j=2]
//			[i=2, j=3] [i=1,j=3] [i=0,j=3]
//Then build appropriate loop for inserting those values from the first array into the second one.
//Displays a 2d array in the console, one line per row.
	
//	1. See if there is a pattern between the input and output
//	2. Find the pattern by writing all the indices of input and output
//	3. Just observe, you may come up with lots of pattern. 
//	4. One pattern, you can observe is that the row index of ouput is in descending order ({2,1,0}, {2,1,0},{2,1,0}) and the coloumn index is 
//	     fixed ({0,0,0}, {1,1,1}, {2,2,2}).
//	5. Another pattern you can observe is that the output's row index= length of row - current index of row - 1;
//	6. Use any of the pattern to find the output. (You can also find your own pattern)
		static void printMatrix(int[][] grid) {
			for (int c = grid.length; c > 0; c--) {
			for (int r = 0; r < grid.length; r++) {							
					System.out.print(grid[c-1][r] + "\t");
				}}			
				System.out.println();
				
			}
//		for (int i = 0; i < values.length; i++) {
//			for (int j = 0; j < values[i].length; j++) {
//				System.out.print(values[i][j] + "\t");
//			}
		
		static void printMatrix1(int[][] grid) {
			for (int c = 0; c < grid.length; c++) {
			for (int r = grid.length; r < grid.length; r--) {							
				System.out.print(grid[r][grid.length-c] + "\t");
			}
			}
				System.out.println();

			}
		
		static void printMatrix2(int[][] grid) {
			for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {							
				System.out.print(grid[j][grid.length-1-i] + "\t");
			}
			}
				System.out.println();
			}
		
//https://stackoverflow.com/questions/2799755/rotate-array-clockwise	
		static void printMatrix4(int[][] mat) {
		    System.out.println("Matrix = ");
		    for (int[] row : mat) {
		        System.out.println(Arrays.toString(row));
		    }
		}
		
		static int[][] rotateCW(int[][] mat) {
		    final int M = mat.length;
		    final int N = mat[0].length;
		    int[][] ret = new int[N][M];
		    for (int r = 0; r < M; r++) {
		        for (int c = 0; c < N; c++) {
		            ret[c][M-1-r] = mat[r][c];
		          
		        }
		    }
		    return ret;
		}
		
//		Net of whether each index goes up, like i here, or down, 
//		like j here (and of whether either or both need to be "flipped" in the assignment, 
		//e.g using arr.length-1-j in lieu of plain j on one side of the = in the assignment;-), 
		//since arr dimensions are arr.length by arr[0].length, and vice versa for newArray, 
		//it seems to me that the first index on arr (second on newArray) must be the one spanning the range from 0 to arr.length-1 included, 
		//and the other range for the other index.
//
//		This is a kind of "basic dimensional analysis" (except that "dimension" is used in a different sense than normally goes with "dimensional analysis" which refers to physical dimensions, i.e., time, mass, length, &c;-). The issue of "flipping" and having each loop go up or down depend on visualizing exactly what you mean and I'm not the greatest "mental visualizer" so I think, in real life, I'd try the various variants of this "axis transposition" until I hit the one that's meant;-).
		static void flip2DArrays(int[][]grid) {
			int row = 4;
			int column = 3;
			int[][]newGrid = new int[row][column];
			for(int i=0; i<grid[0].length; i++){
		        for(int j=grid.length-1; j>=0; j--){
		        System.out.print(grid[j][i] + "\t");
		        }	
		        System.out.println();
		        }			
		    }
		
		//Suppose you have the methods 'int[] reverse(int[] array)' 
		//and 'int[] getColumn(int[][] array, int index)' then you could do a 90 degree CCW rotation as follows: 
		
//		public static int[][] rotate90CCW(int[][] a) {
//		    // a presumed to be rectangular
//		    return IntStream.iterate(a[0].length - 1, i -> i >= 0, i -> i - 1)
//		        .mapToObj(i -> getColumn(a, i))
//		        .toArray(int[][]::new);
//		    
//		}
		
		//doesn't work
		static int[][] rotateClockwise(int[][] matrix) {
		    int rowNum = matrix.length;
		    int colNum = matrix[0].length;
		    int[][] temp = new int[rowNum][colNum];
		    for (int i = 0; i < rowNum; i++) {
		        for (int j = 0; j < colNum; j++) {
		            temp[i][j] = matrix[rowNum - j - 1][i];
		        }
		    }
		    return temp;
		}
		
//		
//		int[][] matrix = {

//		{ 1, 2, 3, 4 }, 
//		{ 5, 6, 7, 8 }, 
//		{ 9, 10, 11, 12 }, 
//		{ 13, 14, 15, 16 }};

		

		// print the elements of each row:

//		int rowsLength = matrix.length;
//		for (int s = 0; s < rowsLength; s++) {
//			printMatrixDemo(rowsLength, s, matrix);
//		}
	





	// Displays a 2d array in the console, one line per row.
//	static void printMatrix(int[][] grid) {
//		for (int r = grid.length-1; r >0; r--) {
//			for (int c = 0; c < grid.length; c++)				
//				System.out.print(grid[r][c] + " ");
//			System.out.println();
//
//		}
//	}

//	static void printMatrix1(int[][] grid) {
//			for (int r = 1; r < grid.length; r++) {
//			for (int c = 1; c < grid[r].length; c++)				
//								//grid[r][c] = (r * 1) + c;
//								System.out.print(grid[r][grid.length-1]);
//				System.out.println();
//		}
//	}

	public static void printMatrixDemo(int size, int row, int[][] matrix) {
		for (int i = 0; i < 7 * size; i++) {
			System.out.print("-");
		}
		System.out.println("-");
		for (int i = 1; i <= matrix[row].length; i++) {
			System.out.printf("| %4d ", matrix[row][i - 1]);
		}
		System.out.println("|");

		if (row == size - 1) {

			// when we reach the last row,
			// print bottom line "---------"

			for (int i = 0; i < 7 * size; i++) {
				System.out.print("-");
			}
			System.out.println("-");

		}		
	}}


//	public static void printRow(int[] row) {
//		for (int i : row) {
//			System.out.print(i);
//			System.out.print("\t");
//		}
//		System.out.println();
//	}}



//output for printMatrixDemo
//-----------------------------
//|    1 |    2 |    3 |    4 |
//-----------------------------
//|    5 |    6 |    7 |    8 |
//-----------------------------
//|    9 |   10 |   11 |   12 |
//-----------------------------
//|   13 |   14 |   15 |   16 |
