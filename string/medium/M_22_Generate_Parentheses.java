package learn.dsa.string.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode - https://leetcode.com/problems/generate-parentheses/description/
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
	Example 1:

	Input: n = 3
	Output: ["((()))","(()())","(())()","()(())","()()()"]
	Example 2:

	Input: n = 1
	Output: ["()"]

	Constraints:

	1 <= n <= 8
 */
public class M_22_Generate_Parentheses {
	//https://www.youtube.com/watch?v=R6RddNeX3ug
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		allParenthesis("(", 1, 0, result, n);
		return result;
	}

	public void allParenthesis(String current, int o, int c, List<String> result, int n){
		if(current.length()==2*n){
			result.add(current);
			return;
		}
		if(o<n)
			allParenthesis(current+"(", o+1, c, result, n);
			if(c<o)
				allParenthesis(current+")", o, c+1, result, n);
	}
}
