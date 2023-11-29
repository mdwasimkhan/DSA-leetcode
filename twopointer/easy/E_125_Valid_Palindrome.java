package learn.dsa.twopointer.easy;

/* Leetcode - https://leetcode.com/problems/valid-palindrome
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
	Given a string s, return true if it is a palindrome, or false otherwise.

	Example 1:

	Input: s = "A man, a plan, a canal: Panama"
	Output: true
	Explanation: "amanaplanacanalpanama" is a palindrome.
	Example 2:

	Input: s = "race a car"
	Output: false
	Explanation: "raceacar" is not a palindrome.
	Example 3:

	Input: s = " "
	Output: true
	Explanation: s is an empty string "" after removing non-alphanumeric characters.
	Since an empty string reads the same forward and backward, it is a palindrome.

	Constraints:

	1 <= s.length <= 2 * 105
	s consists only of printable ASCII characters.
 */
public class E_125_Valid_Palindrome {
	public boolean isPalindrome(String s) {
		// s=s.toLowerCase();
		// System.out.println(s);
		// String forward = "";
		// String backward = "";
		// int n = s.length();
		// for(int i=0;i<n;i++){
		//     int asciiAlpha = (int) s.charAt(i);
		//     if((97 <= asciiAlpha && asciiAlpha < 123) || (48 <= asciiAlpha && asciiAlpha <  58)){
		//         forward+=s.charAt(i);
		//     }
		// }
		// int m = forward.length()-1;

		// while(m>=0){
		//     backward+=forward.charAt(m);
		//     if(m==0){
		//         break;
		//     }else{
		//         m--;
		//     }
		// }
		// return forward.equals(backward);
		int start = 0; 
		int end = s.length() - 1;
		while(start <= end) {
			while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			}
			while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
				end--;
			}
			if(start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
