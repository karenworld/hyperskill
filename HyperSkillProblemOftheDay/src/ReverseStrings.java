
public class ReverseStrings {
	public static void main(String[] args) {
		String fourNumbers = "2002";
		//boolean thesame = false;
		String first = fourNumbers.substring(0,1);
	    String second = fourNumbers.substring(1,2);
	    String third = fourNumbers.substring(2,3);
	    String fourth = fourNumbers.substring(3,4);    		
	    System.out.println(first);
	    System.out.println(second);
	    System.out.println(third);
	    System.out.println(fourth);
	    if((first.equals(fourth) && (second.equals(third)))){
	    	//thesame = true;
	    	System.out.println("1");
	    }else{
	        System.out.println(Math.random());
	    }
	    }
	}

