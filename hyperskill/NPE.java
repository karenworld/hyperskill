package hyperskill;

import java.util.Scanner;

public class NPE {
	public static String concatStrings(String str1, String str2) {
        /* write your code here */
        if(str1== null && str2 == null){
            return "";
        }
        if(str1 == null){
            return str2;
        }
        if(str2 == null) {
            return str1;
        }
        return str1.concat(str2);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //String str1 = scanner.nextLine();
        String str1 = null;
    	//String str2 = scanner.nextLine();
        String str2 = null;
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}


//model answer
//public class Main {
//
//    public static String concatStrings(String str1, String str2) {
//        if (str1 == null && str2 == null) {
//            return "";
//        } else if (str1 == null) {
//            return str2;
//        } else if (str2 == null) {
//            return str1;
//        } else {
//            return str1.concat(str2);
//        }
//    }
//
//    /* Do not change code below */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
//        str2 = "null".equalsIgnoreCase(str2) ? null : str2;
//
//        System.out.println(concatStrings(str1, str2));
//    }
//}

//public class Main {
//
//    public static String concatStrings(String str1, String str2) {
//        /* write your code here */
//
//        return str1 == null ?
//                str2 == null ? "" : str2
//                : str2 == null ? str1 : str1.concat(str2);
//    }
//
//    /* Do not change code below */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
//        str2 = "null".equalsIgnoreCase(str2) ? null : str2;
//
//        System.out.println(concatStrings(str1, str2));
//    }
//}
