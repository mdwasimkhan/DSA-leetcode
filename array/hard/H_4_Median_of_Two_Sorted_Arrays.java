package learn.dsa.array.hard;

import java.util.Arrays;

/*
 * Leetcode - https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
	The overall run time complexity should be O(log (m+n)).
	Example 1:
	
	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
	Example 2:
	
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	
	Constraints:
	
	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106
 */
public class H_4_Median_of_Two_Sorted_Arrays {
	// public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	//     double result = 0;
	//     int totalSize = nums1.length + nums2.length;
	//     int[] master = new int[totalSize];
	//     for(int i=0;i<nums1.length;i++){
	//         master[i]=nums1[i];
	//     }
	//     int i=nums1.length;
	//     for(int j=0;i<nums1.length+nums2.length;i++, j++){
	//         master[i]=nums2[j];
	//     }


	//     Arrays.sort(master);

	//     int leftMiddle = totalSize/2;

	//     if(totalSize%2==0){
	//         int index = leftMiddle-1;
	//         result = (master[index]+master[leftMiddle])/2.0;          
	//     }else{
	//         int index = leftMiddle+1;
	//         result = master[index-1];
	//     }
	//     return result;
	// }
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		// Get the sizes of both input arrays.
		int n = nums1.length;
		int m = nums2.length;

		// Merge the arrays into a single sorted array.
		int[] merged = new int[n + m];
		int k = 0;
		for (int i = 0; i < n; i++) {
			merged[k++] = nums1[i];
		}
		for (int i = 0; i < m; i++) {
			merged[k++] = nums2[i];
		}

		// Sort the merged array.
		Arrays.sort(merged);

		// Calculate the total number of elements in the merged array.
		int total = merged.length;

		if (total % 2 == 1) {
			// If the total number of elements is odd, return the middle element as the median.
			return (double) merged[total / 2];
		} else {
			// If the total number of elements is even, calculate the average of the two middle elements as the median.
			int middle1 = merged[total / 2 - 1];
			int middle2 = merged[total / 2];
			return ((double) middle1 + (double) middle2) / 2.0;
		}
	}
}
