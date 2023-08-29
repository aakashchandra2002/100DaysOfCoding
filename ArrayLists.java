package dsa_problems;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> list = Stream.of("Geeks", "For", "Geeks").collect(Collectors.toCollection(ArrayList::new));
    System.out.println(list);
	}
}
