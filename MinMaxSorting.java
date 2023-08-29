package dsa_problems;
import java.io.*;
import java.util.*;

//here we are creating a structure named Pair
public class MinMaxSorting {
	static class Pair {
		int min;
		int max;
	}
	static Pair getMinMax(int arr[],int n) {
		//Min and Max using sorting
		Pair minmax=new Pair();
		Arrays.sort(arr);
		minmax.min=arr[0];
		minmax.max=arr[n-1];
		return minmax;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		// TODO Auto-generated method stub
 
		int arr[]= {1,2,3,488,99,340};
		int arr_size=arr.length;
		Pair minmax=getMinMax(arr,arr_size);
		System.out.println(minmax.min);
		System.out.println(minmax.max);	
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}

}



















