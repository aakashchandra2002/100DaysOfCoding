package dsa_problems;

public class MinMaxTournament {
	static class Pair{
		int min;
		int max;
	}
	//by a binary search or the tournament approach
	static Pair getMinMax(int arr[],int low,int high)
	{
		Pair minmax=new Pair();
		Pair mml=new Pair();
		Pair mmr=new Pair();
		int mid;
		//if only 2 elements exist
		if(high==low+1)
		{
			if(arr[low]>arr[high])
			{
				minmax.max=arr[low];
				minmax.min=arr[high];
			}
			else {
				minmax.max=arr[high];
				minmax.min=arr[low];
			}
			return minmax;
		}
		mid=(low+high)/2;
		mml=getMinMax(arr,low,mid);
		mmr=getMinMax(arr,mid+1,high);
		if(mml.min<mmr.min)
		{
			minmax.min=mml.min;
		}
		else {
			minmax.min=mmr.min;
		}
		if(mml.max>mmr.max)
		{
			minmax.max=mml.max;
		}
		else {
			minmax.max=mmr.max;
		}
		return minmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,99,10,10};
		int arr_size=arr.length;
		Pair minmax= getMinMax(arr,0,arr_size-1);
		System.out.println("The Minimum element is "+minmax.min);
		System.out.println("The Maximum element is "+minmax.max);
	}

}
