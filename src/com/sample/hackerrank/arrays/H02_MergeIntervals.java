package com.sample.hackerrank.arrays;

// Leetcode : https://leetcode.com/problems/merge-intervals/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
        and return an array of the non-overlapping intervals that cover all the intervals in the input.*/
public class H02_MergeIntervals {
    public static void main(String[] args) {
        // Solution: Youtube desi, has screenshot in phone

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        //Over lapping
        List<int[]> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(intervals, Comparator.comparingInt( i -> i[0]));

        // Add first one to the result.
        int[] newInterval = intervals[0];
        result.add(newInterval);

        // Iterate over the intervals
        for(int[] interval : intervals) {
            // Check if the current interval first int < previous interval second int
            if(interval[0] <= newInterval[1])
                // Overlapping intervals
                // Update the end
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {
                // Disjoint intervals
                // Add new interval to the list
                newInterval = interval;
                result.add(newInterval);
            }
        }
    }
}
