package learn.dsa.array.easy;

/*
 * Leetcode : https://leetcode.com/problems/majority-element/description/
 * 
 * Given an array nums of size n, return the majority element.

	The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

	Example 1:

	Input: nums = [3,2,3]
	Output: 3
	Example 2:

	Input: nums = [2,2,1,1,1,2,2]
	Output: 2
 */
class E_169_Majority_Element {
	// First Attempt
	// public int majorityElement(int[] nums) {
	//     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	//     Integer count = 0;
	//     int majority = 0;
	//     Integer val = 0;
	//     for(int i=0;i<nums.length;i++){
	//         if(i==0 || !map.containsKey(nums[i])){
	//             map.put(nums[i],1);
	//             val = 1;
	//         }else{
	//             val = map.get(nums[i])+1;
	//             map.put(nums[i],val);
	//         }
	//         if(count < val){
	//             count=val;
	//             majority=nums[i];
	//         }
	//     }
	//     return majority;
	// }

	//Boyer-Moore Majority Vote Algorithm
	//Leetcode solution
	// Youtube : https://www.youtube.com/watch?v=X0G5jEcvroo
	public int majorityElement(int[] nums) {
		int majority=nums[0];
		int count = 1;

		for(int i=1;i<nums.length;i++){
			if(majority==nums[i]){
				count++;
			}else{
				count--;
			}
			if(count==0){
				majority=nums[i];
				count=1;
			}
		}
		return majority;
	}    
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		E_169_Majority_Element object = new E_169_Majority_Element();
		System.out.println("Result : "+object.majorityElement(nums));
	}
}