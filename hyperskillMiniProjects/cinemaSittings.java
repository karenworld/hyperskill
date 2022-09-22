package hyperskillMiniProjects;

import java.util.Arrays;
// ? what is a larger room ?
//In a larger room, the tickets are 10 dollars for the front half of the rows 
//and 8 dollars for the back half. 

//Please note that the number of rows can be odd, for example, 9 rows. 

//In this case, the first half is the first 4 rows, and the second half is the other 5 rows.
//
//Calculate the profit from the sold tickets depending on the number of seats 
//and print the result as shown in the examples below. 

//After that, your program should stop. 

//Note that in this project, the number of rows and seats won't be greater than 9.
																																																																																	
public class cinemaSittings {
	public static void main(String[] args) {		
		System.out.println(totalTicketPrice(4, 5));
		//totalTicketPrice(rows, seats);
		System.out.println(totalTicketPrice(8,9));
		System.out.println(totalTicketPrice(9,7));

		System.out.print("Cinema");
		System.out.println();
		int[]col = {1,2,3,4,5,6,7,8,9}; 
		System.out.print(" ");
		//print column
		for(int i = 1; i < col.length; i++) {
			System.out.print(" " + i);	
		}
		System.out.println();
		//print row
		int[] row = new int[8];		
		for(int i = 1; i < row.length-1; i++) {    //with this loop added, it will make a matrix
			System.out.print(" " + row[i]);
		}
			//System.out.print("1");
			for(int m = 5; m < row.length; m++) {		
					
				System.out.print('B');
							//}else {
				//int temp = row[row.length-2];
				//System.out.print("1");
				//row[0] = temp;	
				//row[row.length-1] = 'b';
				
				//System.out.print(" " + "S");	
							}
				System.out.println();
		}
	//}
	
		
	
	//    If the total number of seats in the screen room is not more than 60, 
	//		then the price of each ticket is 10 dollars.


	public static int totalTicketPrice(int rows, int seats) {
		int totalPrice = 0;
		final int frontrowprice = 10;
		final int backrowprice = 8;
		//less than 60 - smaller room , ticket is 10 dollars
		if(((rows * seats) <= 60)) {					
			//return 
					totalPrice = rows * seats * frontrowprice;
			}
		// more than 60 - larger room
		// 10 dollars for front half and 8 dollars for back half
		if ((( rows * seats) > 60)) { 	
			int half = (rows * seats)/2;			
			int frontPrice = frontrowprice * half;
			int backPrice = backrowprice * half;				
			//return 
					totalPrice = frontPrice + backPrice;	
		}
		//if rows are 9
		//In this case, the first half is the first 4 rows, and the second half is the other 5 rows.
		if((rows == 9)) {
			//return 
					totalPrice = (((frontrowprice * 4 * seats) + (backrowprice * 5 * seats)));		
		}
		return totalPrice;}}
		
		