package learn.dsa.string.easy;
/*
 * Leetcode - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	Example 1:
	
	Input: haystack = "sadbutsad", needle = "sad"
	Output: 0
	Explanation: "sad" occurs at index 0 and 6.
	The first occurrence is at index 0, so we return 0.
	Example 2:
	
	Input: haystack = "leetcode", needle = "leeto"
	Output: -1
	Explanation: "leeto" did not occur in "leetcode", so we return -1.
	
	Constraints:
	
	1 <= haystack.length, needle.length <= 104
	haystack and needle consist of only lowercase English characters.
 */
public class E_28_Find_the_Index_of_the_First_Occurrence_in_a_String {

	//Best solution
	public int strStr(String haystack, String needle) {
        int j=needle.length();
        for(int i=0;j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
