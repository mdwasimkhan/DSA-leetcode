package learn.dsa.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Leetcode - https://leetcode.com/problems/group-anagrams/description/
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

	Example 1:

	Input: strs = ["eat","tea","tan","ate","nat","bat"]
	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	Example 2:

	Input: strs = [""]
	Output: [[""]]
	Example 3:

	Input: strs = ["a"]
	Output: [["a"]]

	Constraints:

	1 <= strs.length <= 104
	0 <= strs[i].length <= 100
	strs[i] consists of lowercase English letters.
 */
public class M_49_Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		//O(n * m)
		// https://www.youtube.com/watch?v=NNBQik4phMI
		// https://www.youtube.com/watch?v=0I6IL3TnIZs
		Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
		List<List<String>> ans = new ArrayList<>();
		for(String each : strs){
			Map<Character, Integer> fMap = new HashMap<>();
			for(int i=0;i<each.length();i++){                
				char key = each.charAt(i);
				fMap.put(key, fMap.getOrDefault(key, 0)+1);
			}

			if(map.containsKey(fMap)){
				List<String> list = map.get(fMap);
				list.add(each);
				map.put(fMap, list);
			}else{
				List<String> list = new ArrayList<>();
				list.add(each);
				map.put(fMap,list);
			}
		}
		for(List<String> each : map.values()){
			ans.add(each);
		}
		return ans;
	}

	// O(n*klogK)
	// public List<List<String>> groupAnagrams(String[] strs) {
	//     int n = strs.length;
	//     Map<String, List<String>> map = new HashMap<>();
	//     List<List<String>> ans = new ArrayList<>();
	//     for(int i=0;i<n;i++){
	//         String val = sortArray(strs[i]);
	//         if(map.containsKey(val)){
	//             List<String> list = map.get(val);
	//             list.add(strs[i]);
	//             map.put(val, list);
	//         }else{
	//             List<String> list = new ArrayList<>();
	//             list.add(strs[i]);
	//             map.put(val,list);
	//         }
	//     }
	//     for(Map.Entry each : map.entrySet()){
	//         ans.add((List<String>)each.getValue());
	//     }
	//     return ans;
	// }
	// public String sortArray(String str){
	//     char[] iCharArr = str.toCharArray();
	//     Arrays.sort(iCharArr);
	//     return Arrays.toString(iCharArr);
	// }

	// Brute force Algo : TLE => O(n^2 * m log m)
	// int n = strs.length;
	// List<String> list = new ArrayList<String>();
	// List<List<String>> ans = new ArrayList<List<String>>();
	// for(int i=0;i<n;i++){
	//     char[] iCharArr = strs[i].toCharArray();
	//     Arrays.sort(iCharArr);
	//     String iVal = Arrays.toString(iCharArr);
	//     if(list.contains(iVal)){
	//         continue;
	//     }
	//     List<String> child = new ArrayList<String>();
	//     child.add(strs[i]);
	//     if(i != n-1){
	//         for(int j=i+1;j<n;j++){   
	//             char[] jCharArr = strs[j].toCharArray();
	//             Arrays.sort(jCharArr);
	//             String jVal = Arrays.toString(jCharArr);
	//             if(iVal.equals(jVal)){
	//                 list.add(jVal);                    
	//                 child.add(strs[j]);
	//             }
	//         }
	//     }
	//     ans.add(child);
	// }
	// return ans;
}
