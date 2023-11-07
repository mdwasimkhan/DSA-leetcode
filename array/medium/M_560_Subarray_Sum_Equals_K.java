package learn.dsa.array.medium;

import java.util.HashMap;

/*
 * Youtube - https://www.youtube.com/watch?v=HbbYPQc-Oo4
 * Leetcode - https://leetcode.com/problems/subarray-sum-equals-k
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

	A subarray is a contiguous non-empty sequence of elements within an array.
	
	Example 1:
	
	Input: nums = [1,1,1], k = 2
	Output: 2
	Example 2:
	
	Input: nums = [1,2,3], k = 3
	Output: 2
 */
public class M_560_Subarray_Sum_Equals_K {

	public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currentSum = 0;
        int[] psa = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum == k) {
                count++;
            }
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;        
    }

	public static void main(String[] args) {
		int[] nums = {1,1,1};
		M_560_Subarray_Sum_Equals_K object = new M_560_Subarray_Sum_Equals_K();
		int res = object.subarraySum(nums,2);
		System.out.println("Output : "+res);

	}
}