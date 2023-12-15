package learn.dsa.array.medium;
/*
 * Leetcode - https://leetcode.com/problems/increasing-triplet-subsequence
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
	Example 1:
	
	Input: nums = [1,2,3,4,5]
	Output: true
	Explanation: Any triplet where i < j < k is valid.
	
	Example 2:
	
	Input: nums = [5,4,3,2,1]
	Output: false
	Explanation: No triplet exists.
	
	Example 3:
	
	Input: nums = [2,1,5,0,4,6]
	Output: true
	Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
	
	Constraints:
	1 <= nums.length <= 5 * 105
	-231 <= nums[i] <= 231 - 1

 */
public class M_334_Increasing_Triplet_Subsequence {
	/*
	 * Youtube - https://www.youtube.com/watch?v=Nqht7TDjItM
	 * - https://www.youtube.com/watch?v=xZ5FBqk-cFw
	 */
	public boolean increasingTriplet(int[] nums) {
		//O(n^3)
		// int n = nums.length;
		// for(int i=0;i<n-2;i++){
		//     for(int j=i+1;j<n-1;j++){                
		//         for(int k=j+1;k<n;k++){
		//             if(i<j && j<k && nums[i]<nums[j] && nums[j]<nums[k]){
		//                 return true;
		//             }
		//         }
		//     }
		// }
		// return false;

		//O(n)
		int left = Integer.MAX_VALUE;
		int mid = Integer.MAX_VALUE;
		for(int each : nums){
			if(each<left){
				left=each;
			}else if(each>left && each<mid){
				mid=each;
			}else if(each>mid) {
				return true;    
			}
		}
		return false;
	}
}
