package learn.dsa.array.easy;

class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					result[0]=i;
					result[1]=j;
					return result;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		int[] nums = {1,2,3,7,4,1};
		int[] result = sum.twoSum(nums, 10);
		System.out.println("Result : "+result[0]);
		System.out.println("Result : "+result[1]);
	}
}