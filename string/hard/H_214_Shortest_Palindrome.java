package learn.dsa.string.hard;

/*
 * Leetcode - https://leetcode.com/problems/shortest-palindrome/description/
 * You are given a string s. You can convert s to a 
palindrome by adding characters in front of it.

	Return the shortest palindrome you can find by performing this transformation.

	Example 1:

	Input: s = "aacecaaa"
	Output: "aaacecaaa"
	Example 2:

	Input: s = "abcd"
	Output: "dcbabcd"


	Constraints:

	0 <= s.length <= 5 * 104
	s consists of lowercase English letters only.

 */
public class H_214_Shortest_Palindrome {
	public String shortestPalindrome(String s) {
		int n = s.length();
		int left=0, index=0;
		for(int right=n-1;right>=0;right--){
			if(isPolindrome(s, left, right)){
				index=right;
				break;
			}
		}
		String ans=s;
		for(int i=index+1;i<n;i++){
			ans=s.charAt(i)+ans;
		}
		return ans;
	}

	public boolean isPolindrome(String s, int left, int right){
		if(right==0){
			return true;
		}
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
