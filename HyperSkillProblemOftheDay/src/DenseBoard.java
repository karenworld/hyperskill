import java.util.ArrayList;

public class DenseBoard<T> {
	private T element;
    private ArrayList<ArrayList<T>> myBoard;

    public DenseBoard(T[][] x, T fillElem){
        this.myBoard = new ArrayList<ArrayList<T>>();
        this.element = fillElem;

        for(int i = 0; i < x.length; i++){
            ArrayList<T> values = new ArrayList<T>();
            for(int j = 0; j < x[i].length; j++){
                values.add(x[i][j]);
            }
            myBoard.add(values);
        }
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < myBoard.size(); i++){
            for(int j = 0; j < myBoard.get(i).size(); j++){
                result += myBoard.get(i).get(j);
            }
            //System.out.println();
         // replaced the call to System.out.println() with "\n"..
            result+= "\n";
        }
        return result;
    }
    
    public static void main(String[] args) {
    	String[][] myString = {{"A", "B", "C"}, {"D", "E", "F"}, {"G","H", "I"}};
    	Integer[][] mygrid = {{1, 2, 3, 4}, {5,6,7}, {8,9,10}}; //note: cannot use int[][]mygrid
        DenseBoard<String> temp1 = new DenseBoard<String>(myString, "a");
        DenseBoard<Integer>tmp2 = new DenseBoard<Integer>(mygrid, 1);
        System.out.println(temp1);
        System.out.print(tmp2);
    }
	}

//output

//ABC
//DEF
//GHI

//1234
//567
//8910


