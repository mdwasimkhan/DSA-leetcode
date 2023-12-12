package learn.dsa.array.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Leetcode - https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60
 * You are given a list of songs where the ith song has a duration of time[i] seconds.
	Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
	
	Example 1:
	
	Input: time = [30,20,150,100,40]
	Output: 3
	Explanation: Three pairs have a total duration divisible by 60:
	(time[0] = 30, time[2] = 150): total duration 180
	(time[1] = 20, time[3] = 100): total duration 120
	(time[1] = 20, time[4] = 40): total duration 60
	
	Example 2:
	
	Input: time = [60,60,60]
	Output: 3
	Explanation: All three pairs have a total duration of 120, which is divisible by 60.
	
	Constraints:
	1 <= time.length <= 6 * 104
	1 <= time[i] <= 500
 */
public class M_1010_Pairs_of_Songs_With_Total_Durations_Divisible_by_60 {

	/*
	 * Youtube - https://www.youtube.com/watch?v=4fWKQzN1drQ
	 */
	public int numPairsDivisibleBy60(int[] time) {
		
		// Second attempt
        int n = time.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            int r = time[i]%60;
            if(r>0 && map.containsKey(60-r)){
                count+=map.get(60-r);
            }else if(r==0 && map.containsKey(0)){
                count+=map.get(0);
            }
            if(map.containsKey(r)){
                int val = map.get(r);
                map.put(r, val+1);
            }else{
                map.put(r,1);
            }
        }


        // First attempt
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((time[i]+time[j])%60 ==0){
        //             count++;
        //         }
        //     }
        // }
        return count;
    }
}
