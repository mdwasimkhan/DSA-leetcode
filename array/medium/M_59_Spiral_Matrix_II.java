package learn.dsa.array.medium;
/*
 * Leetcode - https://leetcode.com/problems/spiral-matrix-ii/
 * 	Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
	Example 1:
	
	Input: n = 3
	Output: [[1,2,3],[8,9,4],[7,6,5]]
	Example 2:
	
	Input: n = 1
	Output: [[1]]
	
	Constraints:
	
	1 <= n <= 20
 */
public class M_59_Spiral_Matrix_II {
	
	public int[][] generateMatrix(int n) {
        int left = 0, right = n-1;
        int top = 0, bottom = n-1;

        int[][] ans = new int[n][n];
        int count=1;
        while(left<=right && top <=bottom){

            //Move Right from left
            for(int i=left;i<=right;i++){
                ans[top][i]=count;
                count++;
            }
            top++;

            //Move bottom from top
            for(int i=top;i<=bottom;i++){
                ans[i][right]=count;
                count++;
            }
            right--;

            // This will handle if no new rows are available(if single row is there)
            if(top<=bottom){
                //Move Left from right
                for(int i=right;i>=left;i--){
                    ans[bottom][i]=count;
                    count++;
                }
                bottom--;
            }

            //This if will handle the last bottom to top case not to include.
            if(left<=right){
                //Move top from bottom
                for(int i=bottom;i>=top;i--){
                    ans[i][left]=count;
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}
