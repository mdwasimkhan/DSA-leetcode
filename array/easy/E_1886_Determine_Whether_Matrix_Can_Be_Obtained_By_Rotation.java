package learn.dsa.array.easy;

/*
 * Leetcode - https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
 * Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
	Example 1:

	Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
	Output: true
	Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
	Example 2:

	Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
	Output: false
	Explanation: It is impossible to make mat equal to target by rotating mat.
	Example 3:

	Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
	Output: true
	Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

	Constraints:

	n == mat.length == target.length
	n == mat[i].length == target[i].length
	1 <= n <= 10
	mat[i][j] and target[i][j] are either 0 or 1.
 */
public class E_1886_Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
	public boolean findRotation(int[][] mat, int[][] target) {
		for(int i=0;i<4;i++){
			if(isEqual(mat, target)){
				return true;
			}
			rotate(mat);
		}
		return false;
	}

	public boolean isEqual(int[][] mat, int[][] target){
		int n = mat[0].length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j]!=target[i][j]){
					return false;
				}
			}
		}
		return true;
	}

	public void rotate(int[][] mat){
		int n = mat[0].length;
		//Transpose
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}    
		}

		//Reverse
		for(int i=0;i<n;i++){
			int left=0, right=n-1;
			while(left<right){
				int temp = mat[i][left];
				mat[i][left] = mat[i][right];
				mat[i][right] = temp;
				left++;
				right--;
			}
		}
	}
}
