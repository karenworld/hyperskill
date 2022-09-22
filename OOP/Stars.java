package OOP;


//Your task is to draw a star on the n×n field using the symbols . and *. 
//n is odd and doesn't exceed 15.
//
//To do this, you can follow the instructions:
//
//    Firstly, you need to create a two-dimensional array (matrix) from n×n elements 
//by filling it with the . symbols. Each element of the matrix is a string containing 
//a single symbol.
//    Secondly, fill the middle row of the matrix, the middle column, and the diagonals 
//with the * symbols. As a result, all *'s in the array must form the star figure.
//    Thirdly, output this matrix; elements of the array should be space-separated.

//Sample Input 1:
//
//9
//

//under folder hyperskill
public class Stars {

	public static void main(String[] args) {
		int row = 9;
		int col = 9;
		char[][]StarMatrix = new char[row][col];
		fillMatrixWithDots(StarMatrix);
	}

	//	Let k = n/2 ( if n -> odd, for an array of n*n elements)
	//
	//			Main diagonal condition => i=j
	//			Secondary diagonal condition => i=n-j-1
	//			Middle row => (n=k, loop j to n-1)
	//			Middle column => (loop i to n-1, j=k)

	//Sample Output 1:
	//
	//* . . . * . . . *
	//. * . . * . . * .
	//. . * . * . * . .
	//. . . * * * . . .
	//* * * * * * * * *
	//. . . * * * . . .
	//. . * . * . * . .
	//. * . . * . . * .
	//* . . . * . . . *



	public static char[][] fillMatrixWithDots(char[][]Array) {
		int rows = Array.length;
		int cols = Array[0].length;
		char[][]array = new char[rows][cols];
		//Outer Loop for number of Rows
		for (int i = 0; i < Array.length; i++) {
			// Inner loop for printing '*' in each column.
			for (int j = 0; j < Array[i].length; j++) {
				//Array[i][j] = '*';			
				if(i == j) {
					Array[i][j] = '*';
				}
				if (( j == 1 && i == 0) || (j == 2 && i == 0) || (j == 3 && i == 0) ||
				( j == 5 && i == 0) || (j == 6 && i == 0) || (j == 7 && i == 0) ||
				(i == 1 && j == 0) || ( i == 2 && j == 0) || (i == 3 && j == 0) ||	
				(i == 5 && j == 0) || ( i == 6 && j == 0) || (i == 7 && j == 0) || 
				(i == Array.length-1 && j == 1) || ( i == Array.length-1 && j == 2) || (i == Array.length-1 && j == 3) ||
				(i == Array.length-1 && j == 5) || ( i == Array.length-1 && j == 5) || (i == Array.length-1 && j == 5) ||
				(i == Array.length-1 && j == 6) || ( i == Array.length-1 && j == 6) || (i == Array.length-1 && j == 6)||
				(i == Array.length-1 && j == 7) || ( i == Array.length-1 && j == 7) || (i == Array.length-1 && j == 7) ||
				(i == 1 && j == Array.length - 1)|| (i == 2 && j == Array.length-1) || (i == 3 && j == Array.length - 1) ||
				(i == 5 && j == Array.length - 1) ||
				(i == 6 && j == Array.length - 1)|| 
				(i == 7 && j == Array.length - 1)||
				(j == 1 && i == 2) || (j == 1 && i == 3) || ( j == 1 && i == 5) || (j == 1 && i == 6) || 
				(j == 2 && i == 1) || (j == 2 && i == 3) || ( j == 2 && i == 5) || (j == 2 && i == 7) || 
				(j == 3 && i == 1) || (j == 3 && i == 2) || (j == 3 && i == 6) || (j == 3 && i == 7) ||
				(j == 5 && i == 1) || (j == 5 && i == 2) || ( j == 5 && i == 6) || (j == 5 && i == 7) ||
				(j == 6 && i == 1) || (j == 6 && i == 3) || (j == 6 && i == 5) || (j == 6 && i == 5) || (j == 6 && i == 7) ||
				(j == 7 && i == 2) || (j == 7 && i == 3) || (j == 7 && i == 5) || (j == 7 && i == 6))
								
				{
						

					System.out.print(". ");
				}else {
					System.out.print(Array[i][j] + " ");
				}
			}
				System.out.println();		
			}

			return array;
		}
	}

