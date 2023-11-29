package learn.dsa.twopointer.medium;

/*
 * Leetcode - https://leetcode.com/problems/container-with-most-water/
 * 
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
	Find two lines that together with the x-axis form a container, such that the container contains the most water.
	Return the maximum amount of water a container can store.
	Notice that you may not slant the container.

	Example 1:

	Input: height = [1,8,6,2,5,4,8,3,7]
	Output: 49
	Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
	Example 2:

	Input: height = [1,1]
	Output: 1

	Constraints:

	n == height.length
	2 <= n <= 105
	0 <= height[i] <= 104
 */
public class M_11_Container_With_Most_Water {
	public int maxArea(int[] height) {
		//TLE and run time O(n^2)
		int n = height.length;
		int maxArea=0;
		// for(int i=0;i<n-1;i++){
		//     for(int j=i+1;j<n;j++){
		//         if(height[i]>height[j]){
		//             maxArea=Math.max(maxArea,height[j]*(j-i));
		//         }else{
		//             maxArea=Math.max(maxArea,height[i]*(j-i));
		//         }
		//     }
		// }

		int left=0, right=n-1;
		while(left<right){
			if(height[left]<height[right]){
				maxArea=Math.max(maxArea,height[left]*(right-left));
				left++;
			}else{
				maxArea=Math.max(maxArea,height[right]*(right-left));
				right--;
			}
		}
		return maxArea;
	}
}
