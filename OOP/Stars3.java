package OOP;

public class Stars3 {
	public static void main(String[] args) {
		int row = 9;
		int col = 9;
		char[][]StarMatrix = new char[row][col];
		fillMatrixWithDots(StarMatrix);
	}


	public static char[][] fillMatrixWithDots(char[][]Array) {
		int rows = Array.length;
		int cols = Array[0].length;
		char[][]array = new char[rows][cols];
		//Outer Loop for number of Rows
		for (int i = 0; i < Array.length; i++) {
			// Inner loop for printing '*' in each column.
			for (int j = 0; j < Array[i].length; j++) {
				System.out.print(Array[i][j] = '.');				
				if ( i == j) {
					System.out.print(Array[i][j] = '*');
				}
				System.out.println();
			}
		}
		return array;
	}}
