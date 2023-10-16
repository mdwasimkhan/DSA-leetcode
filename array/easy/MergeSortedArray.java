package learn.dsa.array.easy;

/*
 * https://leetcode.com/problems/merge-sorted-array/description/
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 
 * respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order.  the final sorted array should not be returned by the function, but 
 * instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int nums1Length = nums1.length;
		int nums2Length = nums2.length;
		
		for(int i=nums1Length-nums2Length,j=0;i<nums1Length;i++,j++) {
			nums1[i]=nums2[j];
		}
		
		
		for(int j=0;j<nums1Length;j++) {
			for(int k=j+1;k<nums1Length;k++) {
				if(nums1[j]>nums1[k]) {
					int temp = nums1[j];
					nums1[j] = nums1[k];
					nums1[k] = temp;
				}
			}
		}
	
		System.out.println("Result : ");
		for(int each : nums1) {
			System.out.println(each);
		}
		
	}

	public static void main(String[] args) {
		int[] nums1 = {1,5,7,0,0,0};
		int[] nums2 = {3,4,6};
		int m = 6;
		int n = 3;
		MergeSortedArray object = new MergeSortedArray();
		object.merge(nums1, m, nums2, n);
	}
}
