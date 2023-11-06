package learn.dsa.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Leetcode - https://leetcode.com/problems/3sum/description/
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

	Notice that the solution set must not contain duplicate triplets.

	Example 1:

	Input: nums = [-1,0,1,2,-1,-4]
	Output: [[-1,-1,2],[-1,0,1]]
	Explanation: 
	nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
	nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
	nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
	The distinct triplets are [-1,0,1] and [-1,-1,2].
	Notice that the order of the output and the order of the triplets does not matter.
	Example 2:

	Input: nums = [0,1,1]
	Output: []
	Explanation: The only possible triplet does not sum up to 0.
	Example 3:

	Input: nums = [0,0,0]
	Output: [[0,0,0]]
	Explanation: The only possible triplet sums up to 0.
 */
public class M_15_3_Sum {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet();
		List<List<Integer>> res = new ArrayList<>();
		int i=0;
		for(;i<nums.length;i++){
			int j=i+1;
			int k=nums.length-1;
			while(j<k){
				if(nums[i]+nums[j]+nums[k]==0){
					result.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
				}else if(nums[i]+nums[j]+nums[k]>0){
					k--;
				}else{
					j++;
				}
			}
		}
		res.addAll(result);
		return res;
	}

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		M_15_3_Sum object = new M_15_3_Sum();
		List<List<Integer>> res = object.threeSum(nums);
		object.displayArray(res);

	}

	public void displayArray(List<List<Integer>> res) {
		for(List<Integer> each : res) {
			System.out.println("###########");
			for(Integer child : each) {
				System.out.println("child : "+child);
			}
		}
	}
}