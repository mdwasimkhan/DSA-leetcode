package learn.dsa.twopointer.medium;

import java.util.HashMap;

/*
 * Leetcode - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Given a string s, find the length of the longest 
substring
	 without repeating characters.

	Example 1:

	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
	Example 2:

	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.
	Example 3:

	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

	Constraints:

	0 <= s.length <= 5 * 104
	s consists of English letters, digits, symbols and spaces.
 */
public class M_3_Longest_Substring_Without_Repeating_Characters {
	public int lengthOfLongestSubstring(String s) {
		// https://www.youtube.com/watch?v=qtVh-XEpsJo
		// Intution
		// Traverse like sliding window
		// left =0, right=0 and move right++ until repeating character.
		// increase len in each right++ and put character with position/index in map.
		// if found repeating characters then move left from last first occurance+1.
		// Update map with latest position/index for repeated character


		int n = s.length();
		int left =0, right=0, len = 0;
		HashMap<Character, Integer> map = new HashMap<>();

		while(right<n){
			Character eachChar = s.charAt(right);
			if(map.containsKey(eachChar))
				left = Math.max(map.get(eachChar)+1, left);

			map.put(eachChar, right);
			len = Math.max(len, right-left+1);
			right++;
		}
		return len;





		//##### First attempt ######
		// int n = s.length();
		// if(n==0)
		//     return 0;
		// if(n==1)
		//     return 1;    
		// String sub = "";
		// int bigSub = 0;
		// for(int i=0;i<n-1;i++){
		// 	sub = s.substring(i,i+1);
		// 	for(int j=i+1;j<n;j++){
		// 		if(sub.contains(s.substring(j,j+1))){
		// 			bigSub = Math.max(bigSub, sub.length());
		// 			break;
		// 		}else{
		// 			sub+=s.substring(j,j+1);
		// 			bigSub = Math.max(bigSub, sub.length());
		// 		}
		// 	}
		// }
		// return bigSub;        
	}
}
