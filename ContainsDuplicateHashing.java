package dsa_problems;

import java.util.HashSet;

public class ContainsDuplicateHashing {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//The same problem using Hashing
		 int[] arr = {1,1,1,3,3,4,3,2,4,2};
		 int n = arr.length;
		 if (checkDuplicateWithinK(arr))
		 {
		     System.out.print("Yes");
		 }
		 else 
		 {
		     System.out.print("No");
		 }

	}
	public static boolean checkDuplicateWithinK(int arr[])
	{
		int k=3;
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
				return true;
			set.add(arr[i]);
			if (i>=k)
				set.remove(arr[i-k]);
		}
		return false;
		
	}

}
