package dsa_problems;

public class MinMaxLinearSearch {
	static class Pair{
		int min;
		int max;
	}
	static Pair getMinMax(int arr[],int n) {
		Pair minmax=new Pair();
		if(n==1) {
			minmax.max=arr[0];
			minmax.min=arr[0];
			return minmax;
		}
		if(arr[0]>arr[1])
		{
			minmax.max=arr[0];
			minmax.min=arr[1];
		}
		else {
			minmax.max=arr[1];
			minmax.min=arr[0];
		}
		for(int i=2;i<n;i++)
		{
			if(arr[i]>minmax.max)
			{
				minmax.max=arr[i];
			}
			else if(arr[i]<minmax.min){
				minmax.min=arr[i];
			}
		}
		return minmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,33,22,1,8,423};
		int arr_length=arr.length;
		Pair minmax=getMinMax(arr,arr_length);
		System.out.println("minimum element is "+minmax.min);
		System.out.println("maximum element is "+minmax.max);
		
	}

}
