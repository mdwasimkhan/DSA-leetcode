package learn.dsa.array.easy;

import java.util.Arrays;

/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
	Return the running sum of nums.

	Example 1:

	Input: nums = [1,2,3,4]
	Output: [1,3,6,10]
	Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
	Example 2:

	Input: nums = [1,1,1,1,1]
	Output: [1,2,3,4,5]
	Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
	Example 3:

	Input: nums = [3,1,2,10,1]
	Output: [3,4,6,16,17]
 */
class RunningSumOf1dArray {
	public int[] runningSum(int[] nums) {
		// First Attempt
		//     int[] result = new int[nums.length];
		//     for(int i=0;i<nums.length;i++){
		//         for(int j=i;j>=0;j--){
		//             result[i]=result[i]+nums[j];
		//         }
		//     }
		// return result;

		// Best Solution from Leetcode
		for(int i=1;i<nums.length;i++){
			nums[i]=nums[i-1]+nums[i];
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		RunningSumOf1dArray moveZeroes = new RunningSumOf1dArray();
		System.out.println(Arrays.toString(moveZeroes.runningSum(nums)));
	}
}