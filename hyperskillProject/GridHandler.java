package hyperskillProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridHandler {
	
	static List Create2DArrayList() {
	ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
	// one space allocated for R0
    x.add(new ArrayList<Integer>());
    // Adding 3 to R0 created above x(R0, C0)
    x.get(0).add(0, 3);
 // Creating R1 and adding values
    // (another way for adding values in 2D collections)
    x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));

    // Add 366 to x(R1, C0)
    x.get(1).add(0, 366);

    // Add 576 to x(R1, C4)
    x.get(1).add(4, 576);

    // Adding values to R2
    x.add(2, new ArrayList<>(Arrays.asList(3, 84)));

    // Adding values to R3
    x.add(new ArrayList<Integer>(
        Arrays.asList(83, 6684, 776)));

    // Adding values to R4
    x.add(new ArrayList<>(Arrays.asList(8)));

    // Appending values to R4
    x.get(4).addAll(Arrays.asList(9, 10, 11));

    // Appending values to R1, but start appending from C3
    x.get(1).addAll(3, Arrays.asList(22, 1000));

    return x;
}

public static void main(String args[])
{
    System.out.println("2D ArrayList :");

    // Printing 2D ArrayList
    System.out.println(Create2DArrayList());
}
}