package hyperskillMiniProjects;

public class cinemaSittingwithTickets {
	public static void main(String[] args) {		
		//	System.out.println(" 1 2 3 4 5 6 7 8");
		//	System.out.println();
		final int ROW = 8;
		final int COL = 8;

		//char[][]output = new char[8][8];
		display();
	}

	public static void display() {
		final int ROW = 8;
		final int COL = 8;
		String[][]output = new String[ROW][COL];
		for(int row = 0; row < ROW; row++) {
			for(int col = 0; col < COL; col++) {
				if(row == 0 && col == 0) {
					output[row][col]= (row + col) + "";
				}
				if(row == 2 && col == 2) {
					output[row][col] = "b";
					
				}else {
					if (row!= 0 && col!= 0) {
						output[row][col] =   "S";
					}
					System.out.print(output[row][col] + "\t");
				}
				System.out.println();
			}
		}
	}}