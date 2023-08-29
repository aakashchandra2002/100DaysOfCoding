package dsa_problems;

public class duplicating_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[]{1,2,3,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
