package hyperskillMiniProjects;

public class 2DArraysWithAscii {
	public static void main(String[] args) {
		final int ROWS = 10, COLS = 10;
		System.out.println("Cinema");

		char[][]seats = new char[COLS][ROWS];
		for (int c = 0; c < COLS; c++) {
			for (int r = 0; r < ROWS; r++) {
				seats[c][r] = (char)(r + 'O');							
				if(r == 0) {
					seats[c][r]= (char)(c + 'O');

				}else {
					seats[c][r] = 'S';
				}
			}
		}
		printSeats(seats);
	}

	private static void printSeats(char[][]seats) {
		for (int c = 0; c < seats.length; c++) {
			for (int r = 0; r < seats[c].length; r++) {
				System.out.println(seats[c][r]);
			}
			System.out.println();				
		}
	}
}