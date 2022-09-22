
public class printWords {
	public static void main(String[] args) {	
	
	String text = "hello I am here, how are  you?";
    String[] separated = text.split(" ");//separates by spaces

    for (String word : separated) {
        if (!word.trim().isEmpty()) {
            System.out.println(word);
        }
    }
    String[] splits = text.split("\\s+"); // split by one or more spaces.
    for (String split: splits){
        System.out.println(split);
    }
}
}
