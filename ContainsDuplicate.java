package dsa_problems;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finding whether the given array contains duplicate
		//elements or not.
		 int[] arr = {1,1,1,3,3,4,3,2,4,2};
		 int n = arr.length;
		 if (checkDuplicateWithinK(arr))
		 {
		     System.out.print("Yes");
		 }
		    else {
		      System.out.print("No");
		    }
		
	}
	public static boolean checkDuplicateWithinK(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int j=i+1;
			int range=3;
			while(range > 0 && j<n)
			{
				if(arr[i]==arr[j])
				{
					return true;
				}
				j++;
				range--;
			}
		}
		return false;
	}

}
