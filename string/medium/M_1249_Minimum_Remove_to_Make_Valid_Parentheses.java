package learn.dsa.string.medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

/*
 * Leetcode - https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses
 * Given a string s of '(' , ')' and lowercase English characters.
	Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
	Formally, a parentheses string is valid if and only if:
	It is the empty string, contains only lowercase characters, or
	It can be written as AB (A concatenated with B), where A and B are valid strings, or
	It can be written as (A), where A is a valid string.

	Example 1:

	Input: s = "lee(t(c)o)de)"
	Output: "lee(t(c)o)de"
	Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
	Example 2:

	Input: s = "a)b(c)d"
	Output: "ab(c)d"
	Example 3:

	Input: s = "))(("
	Output: ""
	Explanation: An empty string is also valid.

	Constraints:

	1 <= s.length <= 105
	s[i] is either'(' , ')', or lowercase English letter.
 */
public class M_1249_Minimum_Remove_to_Make_Valid_Parentheses {
	public String minRemoveToMakeValid(String s) {
		int n = s.length();
		Deque<Integer> ad = new ArrayDeque<Integer>();
		StringBuilder result = new StringBuilder();
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='('){
				ad.push(i);
			}else if(s.charAt(i)==')'){ 
				if(!ad.isEmpty() && s.charAt(ad.peek()) == '('){
					ad.pop();  
				}else{
					ad.push(i);
				}                                                  
			}
		}
		HashSet<Integer> set = new HashSet<>(ad);
		if(!ad.isEmpty()){
			for(int i=0;i<n;i++){
				if(!set.contains(i))
					result.append(s.charAt(i));
			}
		}else{
			return s;
		}
		return result.toString();
	}
}
