package learn.dsa.string.easy;

import java.util.Arrays;

/*
 * Leetcode - https://leetcode.com/problems/longest-common-prefix
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string "".

	Example 1:

	Input: strs = ["flower","flow","flight"]
	Output: "fl"
	Example 2:

	Input: strs = ["dog","racecar","car"]
	Output: ""
	Explanation: There is no common prefix among the input strings.


	Constraints:

	1 <= strs.length <= 200
	0 <= strs[i].length <= 200
	strs[i] consists of only lowercase English letters.
 */
public class E_14_Longest_Common_Prefix {
	public String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		int index = 0;
		int i = strs[0].length();
		int j = strs[strs.length-1].length();
		while(index<i && index<j){
			if(strs[0].charAt(index)==strs[strs.length-1].charAt(index)){
				index++;
			}else{
				break;
			}
		}
		if(index == 0){
			return "";
		}else{
			return strs[0].substring(0,index);
		}
	}
}
