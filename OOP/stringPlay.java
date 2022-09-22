package OOP;

public class stringPlay {


	public static String prepareFullName(String firstName, String lastName) {
		// write your code here
		String fullName = null;
		if (firstName != null && lastName != null ) {
			fullName = firstName.concat("").concat(lastName);
		}else{ 
			if (firstName != null)
				fullName = firstName;
		}
		if(lastName != null && firstName == null) {
			fullName = lastName;
		}
		return fullName;
	}    
}
