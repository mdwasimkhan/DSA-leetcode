package learn.dsa.array.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode - https://leetcode.com/problems/pascals-triangle	
 * Given an integer numRows, return the first numRows of Pascal's triangle.
	In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
	
	Example 1:
	
	Input: numRows = 5
	Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
	Example 2:
	
	Input: numRows = 1
	Output: [[1]]
	
	Constraints:
	
	1 <= numRows <= 30
 */
public class E_118_Pascals_Triangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> master = new ArrayList<>();
		for(int i=0;i<numRows;i++){
			List<Integer> child = new ArrayList<>();
			for(int j=0;j<i+1;j++){
				if(j==0 || j==i){
					child.add(1);
				}else{
					int a = master.get(i-1).get(j-1);
					int b = master.get(i-1).get(j);
					child.add(a+b);
				}
			}
			master.add(child);
		}
		return master;
	}
}
