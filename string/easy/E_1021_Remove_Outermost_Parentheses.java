package learn.dsa.string.easy;

/*
 * Leetcode - https://leetcode.com/problems/remove-outermost-parentheses
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
	For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
	A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
	Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
	Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

	Example 1:

	Input: s = "(()())(())"
	Output: "()()()"
	Explanation: 
	The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
	After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
	Example 2:

	Input: s = "(()())(())(()(()))"
	Output: "()()()()(())"
	Explanation: 
	The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
	After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
	Example 3:

	Input: s = "()()"
	Output: ""
	Explanation: 
	The input string is "()()", with primitive decomposition "()" + "()".
	After removing outer parentheses of each part, this is "" + "" = "".

	Constraints:

	1 <= s.length <= 105
	s[i] is either '(' or ')'.
	s is a valid parentheses string.

 */
public class E_1021_Remove_Outermost_Parentheses {
	public String removeOuterParentheses(String s) {
		int count = 0;
		String res = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '(')
				count++;
			else if(s.charAt(i) == ')')
				count--;

			//the only brackets we have to ignore are when count is 0 or count is 1 and bracket is'("
			if((count == 1 && s.charAt(i) == '(') || count == 0)
				continue;
			else {
				res += s.charAt(i);
			}
		}
		return res;
	}
}
