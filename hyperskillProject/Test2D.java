package hyperskillProject;


public class Test2D {
	public static void main(String[] args) {

		int[][]values = 
			{{	11, 12, 13, 14},
					{	21, 22, 23, 24},
					{	31, 32, 33, 24}};

		//desired output
		//		31 21 11 
		//		32 22 12 
		//		33 23 13 
		//		34 24 14 

		//rotated [j][n-1-i] = matrix[i][j]; 

		//	for(int i = 0; i < values.length; i++) {
		//		//for(int j = i; j < values.length; j++) {
		//		for (int j = values.length; j > 0; j--) {
		//		
		//		//System.out.println(values[i][j] + "\t");
		//		 System.out.print(values[j][i] + "\t");
		//		}
		//	System.out.println(""); 
		//	}


		//wrong
		//	for(int i = 0; i < values.length; i++) {
		//		for(int j = i; j < values.length; j++) {
		//		//	System.out.println(values[i][j] + "\t");
		//			 System.out.print(values[j][values.length - 1 - i] + "\t");
		//		}
		//	}

		int[][]array = {{ 3 , 5, 25, 3},
				{ 2, 4 },
				{1, 2, 3, 4 }};

		printMatrix(array);

	}


	static void printMatrix(int[][] grid) {
		int row = 3;
		int col = 4;
		int[][] gridwithColRow = new int[row][col];
		for (int i = 0; i < grid.length; i++) {
			//grid[i] will indicate the no of column count for the current row you are iterating thru			
			for (int j = 0; j < grid[i].length; j++) {// cannot put grid[0]
				System.out.print(grid[i][j] + "\t");
			}		
		System.out.println();		
	}
}
}



//	for (int i = 0; i < values.length; i++) {
//		for (int j = 0; j < values[i].length; j++) {
//			System.out.print(values[i][j] + "\t");
//		}
//		System.out.println(""); //if you don't include this line, it will print all the numbers in a straight line
//	}
//}
//}
