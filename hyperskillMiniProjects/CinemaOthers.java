package hyperskillMiniProjects;

public class CinemaOthers {
	public static void main(String[] args) {
		int rows = 7;
		int seats = 8;
		var seatings = initializeSeatingArrangement(rows, seats);
		printSeatingArrangement(seatings, rows, seats);
	}



private static char[][] initializeSeatingArrangement(int rows, int seats){
	var seatings = new char[rows+1][seats];
	var free = 'S';
	for (int i = 0; i <= rows; i++) {
		for (int j = 0; j < seats; j++) {
			seatings[i][j] = free;
		}			
		}
	return seatings;
	}


private static void printSeatingArrangement(char[][]seatings, int rows, int seats) {
	System.out.println("Cinema:");
	System.out.print(" ");
	for (int i = 0; i <= seats; i++) {
		System.out.print(" " + i);
	}
	for (int i = 1; i <= rows; i++) {
		System.out.println(i + ""); // this will print the vertical under C
		System.out.println();
		for (int j = 0; j < seats; j++) {
			System.out.print("   " + seatings[i][j]);
		}
		System.out.println();
	}
}
}