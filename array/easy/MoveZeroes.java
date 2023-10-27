package learn.dsa.array.easy;

import java.util.Arrays;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	Note that you must do this in-place without making a copy of the array.

	Example 1:
	
	Input: nums = [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Example 2:
	
	Input: nums = [0]
	Output: [0]
 */
class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int countZero = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				countZero++;
			}else if(countZero > 0){
				int value = nums[i];
				nums[i] = 0;
				nums[i-countZero] = value;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		MoveZeroes moveZeroes = new MoveZeroes();
		moveZeroes.moveZeroes(nums);
	}
}