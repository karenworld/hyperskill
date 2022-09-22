package hyperskill;

public class Util {
	 // correct this method to avoid NPE
    public static void printLength(String name) {
        if(name.equals(null)){
            System.out.println("NPE");
        }
        System.out.println(name.length());
    }
}
// a more cleverer way to do this Utility class to avoid NPE
class Utility {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        int size = name != null ? name.length() : 0; // if the string is empty, the size is 0
        System.out.println(size);
    }
}

