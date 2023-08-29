package dsa_problems;

public class MaxSubArraySum {
		public static void main(String[] args) {
			MaxSubArraySum sol=new MaxSubArraySum();
			
			int[] nums1= {-2,1,-3,4,-1,2,1,-5,4};
			int result1=sol.maxSubArray(nums1);
			System.out.println(result1);
			
			int[] nums2=  {-2, -1, -3, -4, -1, -2, -1, -5, -4};
			int result2 = sol.maxSubArray(nums2);
			System.out.println(result2);
		}
		
		    public int maxSubArray(int[] nums1) {
		        int maxEndingHere = nums1[0];
		        int maxSoFar = nums1[0];
		        for (int i = 1; i < nums1.length; i++) {
		            maxEndingHere = Math.max(nums1[i], maxEndingHere + nums1[i]);
		            maxSoFar = Math.max(maxSoFar, maxEndingHere);
		        }
		        return maxSoFar;
		    }
	}
//TODO Auto-generated method stub
//Kadane's Algorithm is a well-known algorithm used to 
//find the maximum subarray sum within a given array of numbers. 
//A subarray is a contiguous sequence of elements from the original array. 
//The algorithm is named after its inventor, Jay Kadane. 
//It is a dynamic programming approach that efficiently solves 
//the maximum subarray sum problem in linear time complexity.

//Here's how Kadane's Algorithm works:
//
//1. Initialize two variables, `maxEndingHere` and `maxSoFar`, 
//to keep track of the maximum subarray sum ending at the current 
//index and the maximum subarray sum seen so far in the array.
//
//2. Iterate through the array from left to right.
//
//3. For each element at index `i`, update `maxEndingHere` 
//as the maximum of the current element and the sum of `maxEndingHere` and the current element. 
//This step effectively considers whether it's better to start 
//a new subarray from the current element or extend the existing subarray.
//
//4. Update `maxSoFar` as the maximum of `maxSoFar` and `maxEndingHere`. 
//This ensures that you are keeping track of the maximum subarray sum seen so far in the entire array.
//
//5. Continue this process for all elements in the array.
//
//6. Once the iteration is complete, `maxSoFar` will hold the maximum subarray sum.
//
//Here's an example to illustrate Kadane's Algorithm:
//
//Consider the array: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`
//
//- Initialize: `maxEndingHere = -2` and `maxSoFar = -2` (for the first element -2)
//- For the second element 1: `maxEndingHere = max(1, 1 - 2) = 1` and `maxSoFar = max(-2, 1) = 1`
//- For the third element -3: `maxEndingHere = max(-3, -3 + 1) = -2` and `maxSoFar = max(1, -2) = 1`
//- For the fourth element 4: `maxEndingHere = max(4, 4 - 2) = 4` and `maxSoFar = max(1, 4) = 4`
//- ...and so on, carrying out these steps for the entire array.
//
//At the end, `maxSoFar` will be 6, which is the maximum subarray sum within the given array. 
//The subarray that corresponds to this sum is `[4, -1, 2, 1]`.
//
//Kadane's Algorithm efficiently solves the maximum subarray sum problem with a time 	
//complexity of O(n), where n is the number of elements in the array, 
//making it a popular choice for related tasks in algorithmic problem-solving.
