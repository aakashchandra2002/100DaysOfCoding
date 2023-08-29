package dsa_problems;
import java.util.*;


public class ArrayLists1 {
	public static void main(String args[])
    {
 
        // create another collection
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        
        // create a ArrayList Integer type
        // and Initialize an ArrayList with arr
        List<Integer> gfg = new ArrayList<Integer>(arr);

        // print ArrayList
        System.out.println("ArrayList : " + gfg);
    }
}
