package learn.dsa.string.hard;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Leetcode - https://leetcode.com/problems/longest-valid-parentheses
 * Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
	substring

	Example 1:

	Input: s = "(()"
	Output: 2
	Explanation: The longest valid parentheses substring is "()".
	Example 2:

	Input: s = ")()())"
	Output: 4
	Explanation: The longest valid parentheses substring is "()()".
	Example 3:

	Input: s = ""
	Output: 0

	Constraints:

	0 <= s.length <= 3 * 104
	s[i] is '(', or ')'.
 */
public class H_32_Longest_Valid_Parentheses {
	public int longestValidParentheses(String s) {
		// https://www.youtube.com/watch?v=qC5DGX0CPFA

		Deque<Character> stack = new ArrayDeque<>();
		Deque<Integer> index = new ArrayDeque<>();
		// For corner cases, when we will have full valid Parentheses from begining only
		index.push(-1);
		int max = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='('){
				stack.push('(');
				index.push(i);
			}else{
				if(!stack.isEmpty() && stack.peek() == '('){
					stack.pop();
					index.pop();
					max = Math.max(max, i-index.peek());
				}else{
					index.push(i);    
				}
			}
		}
		return max;
	}
}
