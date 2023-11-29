package learn.dsa.array.medium;

import java.util.Arrays;

/*
 * 	Leetcode - https://leetcode.com/problems/spiral-matrix-iv
 * You are given two integers m and n, which represent the dimensions of a matrix.
	You are also given the head of a linked list of integers.
	Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.
	Return the generated matrix.

	Example 1:

	Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
	Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
	Explanation: The diagram above shows how the values are printed in the matrix.
	Note that the remaining spaces in the matrix are filled with -1.
	Example 2:

	Input: m = 1, n = 4, head = [0,1,2]
	Output: [[0,1,2,-1]]
	Explanation: The diagram above shows how the values are printed from left to right in the matrix.
	The last space in the matrix is set to -1.

	Constraints:

	1 <= m, n <= 105
	1 <= m * n <= 105
	The number of nodes in the list is in the range [1, m * n].
	0 <= Node.val <= 1000
 */

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class M_2326_Spiral_Matrix_IV {
	public int[][] spiralMatrix(int m, int n, ListNode head) {
		int[][] ans=new int[m][n];
		for(int[] arr:ans){
			Arrays.fill(arr,-1);
		}        
		int left = 0, right = n-1;
		int top = 0, bottom = m-1;

		ListNode cur = head;


		while(left<=right && top <=bottom && cur!=null){

			//Moving right
			for(int i=left;i<=right && cur!=null;i++){
				if(cur!=null){
					ans[top][i]=cur.val;

				}            
				cur=cur.next;        

			}
			top++;

			//Moving bottom
			for(int i=top;i<=bottom && cur!=null;i++){
				if(cur!=null){
					ans[i][right]=cur.val;

				}             
				cur=cur.next;    

			}
			right--;

			//Moving left
			if(top<=bottom){
				for(int i=right;i>=left && cur!=null;i--){
					if(cur!=null){
						ans[bottom][i]=cur.val;

					}                     
					cur=cur.next;    

				}
			}
			bottom--;

			//Moving top
			if(left<=right){
				for(int i=bottom;i>=top && cur!=null;i--){
					if(cur!=null){
						ans[i][left]=cur.val;

					}
					cur=cur.next;    

				}
			}
			left++;
		}
		return ans;
	}
}
