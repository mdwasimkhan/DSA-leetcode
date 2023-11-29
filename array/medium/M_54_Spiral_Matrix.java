package learn.dsa.array.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * 	Leetcode - https://leetcode.com/problems/spiral-matrix
 * Given an m x n matrix, return all elements of the matrix in spiral order.
	Example 1:
	
	Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
	Output: [1,2,3,6,9,8,7,4,5]
	Example 2:
	
	Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
	Output: [1,2,3,4,8,12,11,10,9,5,6,7]
	
	Constraints:
	
	m == matrix.length
	n == matrix[i].length
	1 <= m, n <= 10
	-100 <= matrix[i][j] <= 100
 */
public class M_54_Spiral_Matrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;

		int left = 0, right = m-1;
		int top = 0, bottom = n-1;

		List<Integer> ans = new ArrayList<Integer>();

		while(left<=right && top <=bottom){

			//Move Right from left
			for(int i=left;i<=right;i++){
				ans.add(matrix[top][i]);
			}
			top++;

			//Move bottom from top
			for(int i=top;i<=bottom;i++){
				ans.add(matrix[i][right]);
			}
			right--;

			// This will handle if no new rows are available(if single row is there)
			if(top<=bottom){
				//Move Left from right
				for(int i=right;i>=left;i--){
					ans.add(matrix[bottom][i]);
				}
				bottom--;
			}

			//This if will handle the last bottom to top case not to include.
			if(left<=right){
				//Move top from bottom
				for(int i=bottom;i>=top;i--){
					ans.add(matrix[i][left]);
				}
				left++;
			}
		}
		return ans;
	}
}
