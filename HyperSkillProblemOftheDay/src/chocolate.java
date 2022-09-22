

//1. the number of segments (K) cannot be less than the length ****and***** width of the chocolate. 
//2. the value of k can not be more than the total number of the segment in the chocolate 
//3. the value of k must be 0 when divided by either M ***or***  N
public class chocolate {

	public static void main(String[] args) {
		int m = 4;
		int n = 2;
		int k = 6;
		int i = 2;
		int j = 10;
		int b = 7;
		System.out.println(CutOrNot(m,n,k));
		System.out.println(CutOrNot(i,j,b));
		System.out.println(CutOrNotUsingBoolean(m,n,k));
	}
	

	public static String CutOrNot(int m, int n, int k) {
		//boolean canCut = false;
		String message = "";
		if(( k%m == 0 || k%n == 0) && (k  < (m * n))){				
			//canCut = true;
			message = "true";
		}else {
			//canCut = false;
			message = "false";
		}
		return message;
	}
	
	public static boolean CutOrNotUsingBoolean(int m, int n, int k) {
		boolean canCut = false;		
		if(( k%m == 0 || k%n == 0) && (k  < (m * n))){				
			canCut = true;			
		}else {
			canCut = false;			
		}
		return canCut;
	}
	
	
}
