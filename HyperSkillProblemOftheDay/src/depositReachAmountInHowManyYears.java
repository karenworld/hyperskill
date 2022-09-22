
//Ann puts M money in the bank. The bank increases Ann's deposit by P percent every year. 
//Ann wants to know how many years should pass until her deposit in the bank reaches K money
public class depositReachAmountInHowManyYears {
	public static void main(String[] args) {
		double M = 100;//1
		double P = 15;//100
		double K = 120;//8
//		double M = 1;
//		double P = 100;
//		double K = 8;//8
		System.out.println(years(M,P,K));
	}
	
	
//	make everything a double except the year count. 
//	you are initially putting money in the bank and then the bank is adding their interest to the total every year...
//	1+1 =2, then 2+2=4 then 4+4=8. Thus 3 years
//Test input:
//	100 15 120
//	Correct output:
//	2	
	public static int years(double M, double P, double K) {
		int year = 0;
		
		while(K > M) {		
			if (M == K) {
				break;
			}
		//money = money+money*(p/100);
			M = M + M * (P * 1/100);// note: be careful, cannot put P/100; it has to be p * 1/100 which is p * 0.01
		//M += M * (P * 0.01);//this is also ok
		//m = m * (1 + p/100); // this is what I used in the hyperskill and got a passed
	//	M = M + (M * (M*(P/100)));//wrong, cannot work
		
		year++;
		}
		return year;
	}
	}

