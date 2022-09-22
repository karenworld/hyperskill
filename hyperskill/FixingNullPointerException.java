package hyperskill;

import java.util.Scanner;

public class FixingNullPointerException {
	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String string = null;
        string = "null".equals(string) ? null : string;
        /* Do not change code above */
        
        if (string == null) {
            System.out.println("NPE!");
        } else {
            System.out.println(string.toLowerCase());
        }
    }

	public class checkNPEModelAnswer{
	//model answer
	public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        System.out.println(string == null ? "NPE!" : string.toLowerCase());
    }
}


	

public class checkNPE{
//model answer
public void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    string = "null".equals(string) ? null : string;
    /* Do not change code above */
    try {
        System.out.println(string.toLowerCase());
    } catch (Exception e) {
        System.out.println("NPE!");
    }
}
}}