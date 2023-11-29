package learn.dsa.string.easy;

import java.util.HashMap;
import java.util.Map;
/*
 * Leetcode - https://leetcode.com/problems/roman-to-integer
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
	Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
	
	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.
	Given a roman numeral, convert it to an integer.
	
	Example 1:
	
	Input: s = "III"
	Output: 3
	Explanation: III = 3.
	Example 2:
	
	Input: s = "LVIII"
	Output: 58
	Explanation: L = 50, V= 5, III = 3.
	Example 3:
	
	Input: s = "MCMXCIV"
	Output: 1994
	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	
	Constraints:
	
	1 <= s.length <= 15
	s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
	It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class E_13_Roman_to_Integer {
	public int romanToInt(String s) {
        // int val = 0;
        // int result = 0;
        // for(int i=s.length()-1;i>=0;i--){
        //     if(s.charAt(i)=='V'){
        //         if(i==0){
        //             val = 5;     
        //         }else{    
        //             val =  s.charAt(i-1)=='I' ? 4 : 5; 
        //             if(val == 4)
        //                 i--;
        //         }    
        //     }else if(s.charAt(i)=='X'){
        //         if(i==0){
        //             val = 10;     
        //         }else{ 
        //             val =  s.charAt(i-1)=='I' ? 9 : 10; 
        //             if(val == 9)
        //                 i--;
        //         }        
        //     }else if(s.charAt(i)=='L'){
        //         if(i==0){
        //             val = 50;     
        //         }else{                 
        //             val =  s.charAt(i-1)=='X' ? 40 : 50; 
        //             if(val == 40)
        //                 i--;
        //         }    
        //     }else if(s.charAt(i)=='C'){
        //         if(i==0){
        //             val = 100;     
        //         }else{                     
        //             val =  s.charAt(i-1)=='X' ? 90 : 100; 
        //             if(val == 90)
        //                 i--;
        //         }                            
        //     }else if(s.charAt(i)=='D'){
        //         if(i==0){
        //             val = 500;     
        //         }else{                     
        //             val =  s.charAt(i-1)=='C' ? 400 : 500; 
        //             if(val == 400)
        //                 i--;
        //         }        
        //     }else if(s.charAt(i)=='M'){
        //         if(i==0){
        //             val = 1000;     
        //         }else{                     
        //             val =  s.charAt(i-1)=='C' ? 900 : 1000; 
        //             if(val == 900)
        //                 i--;
        //         }                        
        //     }else{
        //         val = 1;
        //     }
        //     result+=val;
        // }
        // return result;

        // https://www.youtube.com/watch?v=dlATMslQ6Uc
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = m.get(s.charAt(s.length()-1));
        
        for (int i = s.length()-1; i >0 ; i--) {
            if (m.get(s.charAt(i)) > m.get(s.charAt(i - 1))) {
                ans -= m.get(s.charAt(i-1));
            } else {
                ans += m.get(s.charAt(i-1));
            }
        }
        
        return ans;
    }
}
