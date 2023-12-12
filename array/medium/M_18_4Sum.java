package learn.dsa.array.medium;

/* Leetcode - https://leetcode.com/problems/4sum
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
	0 <= a, b, c, d < n
	a, b, c, and d are distinct.
	nums[a] + nums[b] + nums[c] + nums[d] == target
	You may return the answer in any order.
	 
	Example 1:
	
	Input: nums = [1,0,-1,0,-2,2], target = 0
	Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
	
	Example 2:
	
	Input: nums = [2,2,2,2,2], target = 8
	Output: [[2,2,2,2]]
	
	Constraints:
	
	1 <= nums.length <= 200
	-109 <= nums[i] <= 109
	-109 <= target <= 109
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_18_4Sum {

	public static void main(String[] args) {
		int[] sums = {1000000000,1000000000,1000000000,1000000000};
		System.out.println("Result : "+new M_18_4Sum().fourSum(sums, -294967296));
		
	}
	//Youtube - youtube.com/watch?v=eD95WRfh81c
	public List<List<Integer>> fourSum(int[] nums, int target) {
		int n = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> child = null;
		for(int i=0;i<n;i++){
			if(i>0 && nums[i] == nums[i-1]) continue;
			for(int j=i+1;j<n;j++){
				if(j!=(i+1) && nums[j] == nums[j-1]) continue;
				int left = j+1;
				int right = n-1;
				while(left<right){
					long sum = nums[i];// if use int here then below input does not work
					// [1000000000,1000000000,1000000000,1000000000]
					// -294967296
					// 2,147,483,647
					System.out.println("sum : "+sum);
					sum += nums[j];
					System.out.println("sum : "+sum);
					sum += nums[left];
					System.out.println("sum : "+sum);
					sum += nums[right];
					System.out.println("sum : "+sum);
					// Below line also will not work because each addition will be int so it will work as int only.
					//long sum = nums[i]+nums[j]+nums[left]+nums[right]; 
					System.out.println("sum : "+sum);
					if(sum == target){
						child = new ArrayList<Integer>();
						child.add(nums[i]);
						child.add(nums[j]);
						child.add(nums[left]);
						child.add(nums[right]);
						ans.add(child);
						left++;
						right--;
						while(left<right && nums[left]==nums[left-1]) left++;
						while(left<right && nums[right]==nums[right+1]) right--;
					}else if(sum  > target){
						right--;
					}else{
						left++;
					}
				}
			}
		}
		return ans;
	}
}
