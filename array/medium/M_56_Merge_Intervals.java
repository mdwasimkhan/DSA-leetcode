package learn.dsa.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Leetcode - https://leetcode.com/problems/merge-intervals/description/
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

	Example 1:
	
	Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
	Output: [[1,6],[8,10],[15,18]]
	Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
	Example 2:
	
	Input: intervals = [[1,4],[4,5]]
	Output: [[1,5]]
	Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class M_56_Merge_Intervals {

	public int[][] merge(int[][] intervals) {
		if (intervals.length <= 1)
			return intervals;
		
		// Sort by ascending starting point
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		
		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);
		
		for (int[] interval : intervals) {
			if (interval[0] <= newInterval[1]) { // Overlapping intervals, move the end if needed
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			}
			else {                             // Disjoint intervals, add the new interval to the list
				newInterval = interval;
				result.add(newInterval);
			}
		}

		return result.toArray(new int[result.size()][]);
	}
	
	public static void main(String[] args) {
		int[] first = {1,3};
		int[] second = {5,6};
		int[] third = {8,10};
		int[] fourth = {15,18};
		
		int[][] intervals = new int[4][2];
		intervals[0] = first;
		intervals[1] = second;
		intervals[2] = third;
		intervals[3] = fourth;
		M_56_Merge_Intervals object = new M_56_Merge_Intervals();
		int[][] res = object.merge(intervals);
		object.displayArray(res);

	}
	
	public void displayArray(int[][] res) {
		for(int[] each : res)
			System.out.println("Result : "+each[0]+", "+each[1]);
	}
}
