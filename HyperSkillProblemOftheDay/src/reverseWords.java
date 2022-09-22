import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class reverseWords {
	public static void main(String[] args) {	
		String wordsToProcess = "welcome";
		System.out.println(reverse(wordsToProcess));		
	}
		
	public static String reverse(String input) {
		if (input == null) {
	        return input;
	    }
		String output = "";

	    for (int i = input.length() - 1; i >= 0; i--) {
	        output = output + input.charAt(i);
	    }

	    return output;
	}
	
	@Test
	public void whenReverseIsCalled_ThenCorrectStringIsReturned() {
	    String reversed = reverseWords.reverse("cat");
	    String reversedNull = reverseWords.reverse(null);
	  //  String reversedEmpty = reverseWords.reverse(StringUtils.EMPTY);

	    assertEquals("tac", reversed);
	    assertEquals(null, reversedNull);
	    //assertEquals(StringUtils.EMPTY, reversedEmpty);
	}
}