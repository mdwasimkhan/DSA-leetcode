package learn.dsa.string.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Leetcode - https://leetcode.com/problems/valid-parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	An input string is valid if:
	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Every close bracket has a corresponding open bracket of the same type.

	Example 1:

	Input: s = "()"
	Output: true
	Example 2:

	Input: s = "()[]{}"
	Output: true
	Example 3:

	Input: s = "(]"
	Output: false

	Constraints:

	1 <= s.length <= 104
	s consists of parentheses only '()[]{}'.
 */
public class E_20_Valid_Parentheses {
	public boolean isValid(String s) {
		int n = s.length();

		Deque<Character> deque = new ArrayDeque<>();
		for(int i=0;i<n;i++){
			if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
				deque.push(s.charAt(i));
			}else if (!deque.isEmpty()){
				if(deque.peek() == '{' && s.charAt(i) == '}'
						|| deque.peek() == '[' && s.charAt(i) == ']'
						|| deque.peek() == '(' && s.charAt(i) == ')'){
					deque.pop();
				}else{
					return false;
				}
			}else{
				return false;
			}
		}    
		// Below condition to check for single character in s
		if(!deque.isEmpty())
			return false;
		return true;
	}
}
