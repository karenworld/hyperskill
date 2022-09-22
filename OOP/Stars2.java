package OOP;

public class Stars2 {

	public static void main(String[] args) {
		int row = 9;
		int col = 9;
		int row1 = 5;
		int col1 = 5;
		char[][]StarMatrix = new char[row][col];
		char[][]StarMatrix1 = new char[row1][col1];
		fillMatrixWithDots(StarMatrix);
		System.out.println();
		fillMatrixWithDots(StarMatrix1);
	}

	//			Let k = n/2 ( if n -> odd, for an array of n*n elements)
	//
	//			Main diagonal condition => i=j
	//			Secondary diagonal condition => i=n-j-1
	//			Middle row => (n=k, loop j to n-1)
	//			Middle column => (loop i to n-1, j=k)


	public static char[][] fillMatrixWithDots(char[][]Array) {

		int rows = Array.length;
		int cols = Array[0].length;
		//int center = (int) Math.ceil(cols / 2.0) - 1;
		int center = (Array.length-1)/2;
		char[][]array = new char[rows][cols];
		//Outer Loop for number of Rows
		for (int i = 0; i < Array.length; i++) {
			// Inner loop for printing '*' in each column.
			for (int j = 0; j < Array[i].length; j++) { 
				Array[i][j] = '.';	
				if(i == j || (j == center || i == center) || (j ==( Array.length - 1) - i)) {  
					//	(j == (Array.length - 1) - i)) {            
					Array[i][j] = '*';	         
					System.out.print(Array[i][j] + " ");
					//System.out.print('*');	
				}else {	
					Array[i][j] = '.';	 
					System.out.print(Array[i][j] + " ");
				}}
			System.out.println();		
		}

		return array;
	}
}






