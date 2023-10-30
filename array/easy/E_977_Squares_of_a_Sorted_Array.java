package learn.dsa.array.easy;

/*
 * Leetcode : https://leetcode.com/problems/squares-of-a-sorted-array/description/
 * 
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

	Example 1:
	
	Input: nums = [-4,-1,0,3,10]
	Output: [0,1,9,16,100]
	Explanation: After squaring, the array becomes [16,1,0,9,100].
	After sorting, it becomes [0,1,9,16,100].
	Example 2:
	
	Input: nums = [-7,-3,2,3,11]
	Output: [4,9,9,49,121]
 */
class E_977_Squares_of_a_Sorted_Array {
	public int[] sortedSquares(int[] nums) {
        // My Solution in first attempt
        // int[] result = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     result[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(result);
        // return result;

        // Leetcode solution
        int n = nums.length;
        int[] result = new int[n];
        int i=0,j=n-1;
        for(int p=n-1;p>=0;p--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                result[p]=nums[i]*nums[i];
                i++;
            }else{
                result[p]=nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		E_977_Squares_of_a_Sorted_Array object = new E_977_Squares_of_a_Sorted_Array();
		for(int each : object.sortedSquares(nums)) {
			System.out.println(each);
		}
	}
}