
public class ArraysConsecutveNumbers {	
	

	static int HasConsecutive(int[] a){
		  int cnt = 0;
		  for (int i = 1; i < a.length-2; i++) {
			 if (a[i + 1] == a[i] + 1 && a[i + 2] == a[i] + 2) {		
			  cnt++;   
			  }		
			  }
		  return cnt;
		}
	
	static int ThreeConsecutiveElementsInArray(int[]a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+ 1; j < a.length; j++) {
				for(int k = j + 2; k < a.length; k++) {//not i + 2
					if(a[k] - a[j] - a[i] == 0) {
						count ++;
					}
				}
			}
		}		
		return count;
	}
	
	//another way to do it
	
	static int ThreeConsecutiveInArray(int[]a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+ 1; j < a.length; j++) {
				for(int k = j + 2; k < a.length; k++) {//not i + 2
					 int first = a[i];
	                    int second = a[j];
	                    int third = a[k];
	                    
	                    if (second - 1 == first && third - 2 == first) {
	                      
						count ++;
					}
				}
			}
		}		
		return count;
	}
   
    
    public static void main(String[] args) {
		int[]array = {1, 2, 4, 5, 6, 7};
		int[]array1 = {1, 4, 7, 5, 4, 3};
    	System.out.println(HasConsecutive(array));
    	System.out.println(HasConsecutive(array1));
    	System.out.println(ThreeConsecutiveElementsInArray(array));
    	System.out.println(ThreeConsecutiveInArray(array));
	}
}


