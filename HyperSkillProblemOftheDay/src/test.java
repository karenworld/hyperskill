
public class test {
	public static void main(String[] args) {
		
	
	int[]nums = {0,1,2,3,4};
	for (int i = nums.length - 1; i >= 0; i--) { System.out.print(nums[i]); }//ok
	System.out.println();
	for (int i = 1; i <= 3; i++) { System.out.print(nums[i]); }//not ok
	System.out.println();
	for (int i = 0; i <= 3; i++) { System.out.print(nums[i]); }//ok
	System.out.println();
	for (int i = 0; i < nums.length; i++) { System.out.print(nums[i]); }//ok
	System.out.println();
	for (int i = 0; i <= 3; i++) { System.out.print(nums[0]); }// not ok
	}
}