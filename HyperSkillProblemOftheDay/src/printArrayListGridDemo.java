import java.util.ArrayList;

public class printArrayListGridDemo {
	public static void main(String[] args) {
		
	
	ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>(); //2d ArrayList
    ArrayList<Integer> x = new ArrayList<Integer>(); 
    x.add(10);
    x.add(20);
//    x.add(30);
//    x.add(40);
    table.add(x); 
    table.add(x); 
    //to add a new row
    table.add(new ArrayList<Integer>());
    table.get(0).add(0);
    table.get(0).add(10);
    table.get(1).add(20);
    table.get(1).add(30);

    System.out.println("Value="+table); //Prints table[][]
    System.out.println("Value="+table.get(0)); //Prints table[0]
    System.out.println("Value="+table.get(0).get(1)); //Prints table [0][1]
}
}
//output
//Value=[[10, 20], [10, 20]]
//Value=[10, 20]
//Value=20