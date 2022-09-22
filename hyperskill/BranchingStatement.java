package hyperskill;

public class BranchingStatement {
	
	public static void main(String[] args) {		
	
	for (int i = 0; i < 5; i++) { 
	    for (char letter = 'a'; letter <= 'f'; letter++) { 
	        if (letter < 'f') { 
	            continue; 
	        } 
	        System.out.println(letter); 
	    } 
	}
	
	for (int j = 0; j < 11; j++) {
	    if (j % 2 != 0) {
	        continue;
	    } 
	    System.out.print(j + " ");
	}
	//result : 2,4,6,8,10 (all these numbers will be 0 or even)

	int i = 10;
	while (true) { // the condition to continue the loop
	    if (i == 0) { // the condition to perform the break that stops this loop 
	        break;
	    }
	    i--;
	}

	
	int n = 10;
	for (int k = 0; k < n; k++) {
	    if (k % 2 != 0) {
	        continue;
	    }
	    System.out.print(k + " ");
	}
	
	for (int m = 0; m < 10; m++) {
	    for (int j = 0; j < 10; j++) {
	        System.out.print(j + " ");
	        if (m == j) {
	            break;
	        }
	    }
	    System.out.println();
	}
	
//	0 
//	0 1 
//	0 1 2 
//	0 1 2 3 
//	0 1 2 3 4 
//	0 1 2 3 4 5 
//	0 1 2 3 4 5 6 
//	0 1 2 3 4 5 6 7 
//	0 1 2 3 4 5 6 7 8 
//	0 1 2 3 4 5 6 7 8 9 
	
	//To stop the outer loop we'd like to declare a Boolean variable stopped 
	//and use it as a special Boolean flag.
	boolean stopped = false;
	for (int l = 0; (l < 10) && !stopped; l++) {
	    for (int j = 0; j < 10; j++) {
	        System.out.print(j + " ");
	        if (l == j) {
	            stopped = true;
	            break;
	        }
	     }
	    System.out.println();
	}
	//The continue statement 
	//and the break statement only affect the loop in which they are located. The continue statement cannot skip the current iteration of the outer loop.
	
	//nested loops
	for (int a = 1; a < 10; a++) {
	    for (int j = 1; j < 10; j++) {
	        System.out.print(a * j + "\t");
	    }
	    System.out.println();
	}
	
	//output
	
//	1   2   3   4   5   6   7   8   9  
//	2   4   6   8   10  12  14  16  18  
//	3   6   9   12  15  18  21  24  27  
//	4   8   12  16  20  24  28  32  36  
//	5   10  15  20  25  30  35  40  45  
//	6   12  18  24  30  36  42  48  54  
//	7   14  21  28  35  42  49  56  63  
//	8   16  24  32  40  48  56  64  72  
//	9   18  27  36  45  54  63  72  81 
}
}
