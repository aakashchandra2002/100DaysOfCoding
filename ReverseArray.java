package dsa_problems;

public class ReverseArray {
//	static void reverseArray(int arr[],int start,int end)
//	{
//		int temp;
//		while(start<end) {
//			temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start+=1;
//			end-=1;
//		}
//	}
//	static void printArray(int arr[],int arr_size) {
//		for(int i=0;i< arr_size;i++) 
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//Reversing an array 
//		int arr[]= {1,2,3,4,5};
//		int arr_size=arr.length;
//		printArray(arr,arr_size);
//		reverseArray(arr,0,arr_size-1);
//		printArray(arr,arr_size);
//		
//	}
//
//}
	static void reverseArray(int arr[],int start,int end){
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start+=1;
			end-=1;
		}
	}
	static void printArray(int arr[],int arr_size){
		for(int i=0;i<arr_size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		int arr_size=arr.length;
		printArray(arr,arr_size);
		reverseArray(arr,0,arr_size-1);
		printArray(arr,arr_size);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
