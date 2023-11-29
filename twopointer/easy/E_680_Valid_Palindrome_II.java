package learn.dsa.twopointer.easy;

/*
 * Leetcode - https://leetcode.com/problems/valid-palindrome-ii
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
	Example 1:

	Input: s = "aba"
	Output: true
	Example 2:

	Input: s = "abca"
	Output: true
	Explanation: You could delete the character 'c'.
	Example 3:

	Input: s = "abc"
	Output: false

	Constraints:

	1 <= s.length <= 105
	s consists of lowercase English letters.
 */
public class E_680_Valid_Palindrome_II {
	public boolean isValidPalindrome(String s, int left, int right){
		while(left<right){
			if(s.charAt(left)==s.charAt(right)){
				left++;
				right--;
			}else{
				return false;
			}
		}
		return true;
	}

	public boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		while(left<right){
			if(s.charAt(left)==s.charAt(right)){
				left++;
				right--;
			}else{
				return isValidPalindrome(s, left+1, right) || isValidPalindrome(s, left, right-1);
			}
		}
		return true;
	}
}
