package learn.dsa.string.medium;

/*
 * Leetcode - https://leetcode.com/problems/longest-palindromic-substring
 * Given a string s, return the longest 
palindromic

	substring
	 in s.

	Example 1:

	Input: s = "babad"
	Output: "bab"
	Explanation: "aba" is also a valid answer.
	Example 2:

	Input: s = "cbbd"
	Output: "bb"

	Constraints:

	1 <= s.length <= 1000
	s consist of only digits and English letters.
 */
public class M_5_Longest_Palindromic_Substring {
	public String longestPalindrome(String s) {
		int n = s.length();
		int maxLength = 0;
		String ans = "";
		int[][] arr = new int[n][n];
		for(int diff=0;diff<n;diff++){
			for(int i=0,j=i+diff;j<n;i++,j++){
				if(i==j){
					arr[i][j]=1;
				}else if(j-i == 1){
					arr[i][j]=s.charAt(i)==s.charAt(j) ? 2 : 0;
				}else{
					if(s.charAt(i) == s.charAt(j) && arr[i+1][j-1] > 0){
						arr[i][j]=arr[i+1][j-1] + 2;
					}
				}
				if(arr[i][j] > 0){
					maxLength=Math.max(arr[i][j], maxLength);
					ans=s.substring(i, i+maxLength);
				}
			}
		}
		return ans;
	}
}
