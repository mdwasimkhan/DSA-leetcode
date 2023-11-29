package learn.dsa.array.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode - https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
	Example 1:

	Input: nums = [4,3,2,7,8,2,3,1]
	Output: [5,6]
	Example 2:

	Input: nums = [1,1]
	Output: [2]


	Constraints:

	n == nums.length
	1 <= n <= 105
	1 <= nums[i] <= n
 */
public class E_448_Find_All_Numbers_Disappeared_in_an_Array {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		List<Integer> ans = new ArrayList<>();
		for(int i=1;i<=n;i++){
			int val = Math.abs(nums[i-1]);
			if(nums[val-1] > 0){ // This line is very important, if any value is -ve it means we already covered so no need to do it again, because if we do again it will make it +ve and will miss this number.
				nums[val-1]*=-1;
			}
		}

		for(int i=0;i<n;i++){
			if(nums[i]>0){
				ans.add(i+1);
			}
		}
		return ans;
	}
}
