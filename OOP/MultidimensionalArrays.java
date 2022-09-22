package OOP;

import java.util.Arrays;
import java.util.stream.IntStream;
//under hyperskill

public class MultidimensionalArrays {
	public static void main(String[] args) {		

		int[][] c = { 
				{ 40, 30, 25, 30, 15},
				{ 13, 12, 16 },
				{ 101, 125, 114, 131 }
		}; 

		//System.out.print(c.length + " ");//3

		for (int[] nestedArray : c) {//for-each loop is giving us the numbers of the actual length (columns) of every row.
			//	System.out.print(nestedArray.length + " "); //5 3 4
		}

		//			Given the number n, not greater than 100, 
		//			create a matrix of size n×n and fill it using the following rule. 
		//			Numbers 0 should be stored on the primary (main) diagonal. 
		//			The two diagonals, adjacent to the primary one, should contain numbers 1. 
		//			The next two diagonals should contain numbers 2; etc.
		//
		//			Note: the primary diagonal runs from the top left corner to the bottom right corner.

		//			 Sample Input 1:
		//
		//				 5
		//
		//				 Sample Output 1:
		//
		//				 0 1 2 3 4
		//				 1 0 1 2 3
		//				 2 1 0 1 2
		//				 3 2 1 0 1
		//				 4 3 2 1 0
		System.out.println();

		int[][]array = new int[5][5];
		returnDiagonalMatrix(array);

		int[][]array1 = {{ 0, 1, 2},
				{1, 2, 3},
				{2, 3, 4}};

		int[][]array3 = {{0 , 0 , 0, 0 },
				{1, 0 , 0 , 0},
				{0, 0 ,0 , 0 }
		};

		//		4
		//		0 0 0 0
		//		1 0 0 0
		//		0 0 0 0

		int row = 3;
		int col = 2;

		int[][]array2 = {{2},
				{0, 0},
				{1, 1}};

		//SymmetricMatrix(array1);
		//	boolean sym = false;

		//SymmetricMatrix(array2, sym);

		//SymmetricMatrix1(array2);
		//		SymmetricMatrix(array2, true);
		//		if (isSymmetrix) 
		//			System.out.println("Yes");
		//		else System.out.println("No");
		//		}
		//		SymmetricMatrix1(array3, row, col);
		//		SymmetricMatrix1(array2);
		//		SymmetricMatrix1(array1);
		isSymetric1(array2);

		isSymetric1(array2);
		if (isSymetric1(array2) == false) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

	//https://stackoverflow.com/questions/62034616/multi-dimensional-array-fill-the-matrix-by-numbers
	//the column number minus the row number, or j - i, except there's no negatives, 
	//which can easily be solved with an absolute value (Math.abs(int))
	public static int[][]returnDiagonalMatrix(int[][]grid){
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {	
				//System.out.print(Math.abs(j-i));
				grid[i][j] = Math.abs(j - i);

				System.out.print(grid[i][j] + " ");

			}
			System.out.println();
		}
		return grid;
	}	

	//	Given the number n, not exceeding 10, and a matrix of size n × n.
	//
	//	Check whether this matrix is symmetric in relation to the main diagonal. 
	//	Output the word “YES”, if it is symmetric and the word “NO” otherwise.
	//
	//	Keep in mind that the main diagonal runs from the top left corner to the bottom right corner.

	//	matrix[i][j] != matrix[j][i]	


	//	 Sample Input 1:
	//
	//		 3
	//		 0 1 2
	//		 1 2 3
	//		 2 3 4
	//
	//		 Sample Output 1:
	//
	//		 YES

	//PART OF THE LOOP
	//	if(pole[i][j] != pole[j][i]) {
	//		  out = "NO";
	//		  break;
	//		}

	//example of using break in a nested loop
	//	boolean finished = false;
	//	for (int i = 0; i < 5 && !finished; i++) {
	//	    for (int j = 0; j < 5; j++) {
	//	        if (i * j > 6) {
	//	            finished = true;
	//	            break;
	//	        }
	//	    }
	//	}

	public static boolean SymmetricMatrix(int[][]array, boolean sym) {
		sym = true;
		//array = new int[row][col];
		//		for (int k = 0; k < row; k++) {
		//			for (int k2 = 0; k2 < col; k2++) {
		//				if(row != col) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[i][j] != array[j][i]) {
					sym = false;
					System.out.println("No");
					break;
				}}
			System.out.println("Yes");
		}

		return sym;
	}


	static void SymmetricMatrix1(int[][]array) {	
		int row = array.length;
		int col = array[0].length;
		if(row != col) {
			System.out.println("No");
			return;
		}
		int[][]newGrid = new int[row][col];
		for (int k = 0; k < row -1; k++) {
			for (int k2 = 0; k2 < col -1; k2++) {
				if(array[k][k2] != array[k2][k]) {
					System.out.println("No");			
					break;
					//return;
					//				}else {		// there is no need else
				}}}
		System.out.println("Yes");

	}					

	//	public static boolean isSymmetric(int[][] a) {
	//	    // a supposed to be square
	//	    return IntStream.range(0, a[0].length)
	//	        .allMatch(i -> Arrays.equals(a[i], getColumn(a, i)));
	//	}


	//	public static int[] getColumn(int[][] a, int index) {
	//		if (!a.isRectangular()) throw new RuntimeException("...");
	//	    return Arrays.stream(a)   // gives all the rows of a, one by one
	//	                 .mapToInt(row -> row[index])   // map each row to the int row[index]
	//	                 .toArray();   // and make an int[] array of all these ints
	//	    
	//	}

	//https://stackoverflow.com/questions/30426909/get-columns-from-two-dimensional-array-in-java
	public static Object[] getColumn(Object[][] array, int index){
		Object[] column = new Object[array[0].length]; // Here I assume a rectangular 2D array! 
		for(int i=0; i<column.length; i++){
			column[i] = array[i][index];
		}
		return column;
	}

	int[] getColumn(int[][] matrix, int column) {
		return IntStream.range(0, matrix.length)
				.map(i -> matrix[i][column]).toArray();
	}


	//And if you want to cope with rows that are too short:
	int[] getColumn(int[][] matrix, int column, int defaultVal) {
		return IntStream.range(0, matrix.length)
				.map(i -> matrix[i].length < column ? defaultVal : matrix[i][column])
				.toArray();
	}

	int[]getColumn(int[][]array){		
		int rows = array.length;
		int col = array[0].length;
		int[] coloumn = new int[array[0].length];
		int[][] Newarray = new int[rows][col];
		for (int i = 0 ; i < array.length ; i++) {
			for (int j = 0 ; j < array[0].length; j++) {
				col = array[j][i]; 
			}}
		return coloumn;
	}
	

	private <T> T[] getColumn(int address, T[][] from) {
		return (T[]) Arrays.stream(from).map(x -> x[address]).toArray(Object[]::new);
	}

	//doesn't work
	private static boolean isSymetric1( int[][] ary )
	{
		int n = ary.length-1;
		for( int i = 0 ; i < n ; i++ )
			for( int j = 0 ; j < i ; j++ ) // optimized
				if( ary[i][j] != ary[j][i] )
					return false;
		return true;
	}

	public static void SymmetricMatrix2(int[][]array) {
		boolean isSymmetric = true;
		int row = array.length;
		int col = array[0].length;
		int [][] newGrid = new int[row][col];
		for (int k = 0; k < array.length; k++) {
			for (int k2 = 0; k2 < array.length; k2++) {                    
				if(array[k][k2] != array[k2][k]) {
					System.out.println("NO");
					System.out.println();
					isSymmetric = false;                
				}else {
					System.out.println("YES");
					isSymmetric = true;
				} 
				// System.out.println();               
			}
			System.out.println();
		}

	}
}



//ismatch = true;
//for (int k = 0; k < number.length - 1; k++) {
//  for (int l = 0; l < number.length - 1; l++) {
//    if (number[k][l] != number[l][k]) {
//      ismatch = false;
//      break;
//    }
//  }
//}

//2
//0 0
//1 1

