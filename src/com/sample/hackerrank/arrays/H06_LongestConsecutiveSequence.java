package com.sample.hackerrank.arrays;

/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

        You must write an algorithm that runs in O(n) time.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Example 1:

        Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

        Example 2:

        Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9*/
public class H06_LongestConsecutiveSequence {
    public static void main(String[] args) {

/*        Create an empty hash.
        Insert all array elements to hash.
        Do the following for every element arr[i]
        Check if this element is the starting point of a subsequence.To check this, simply look for arr[i] –1 in the
        hash,if not found, then this is the first element of a subsequence.
                If this element is the first element, then count the number of elements in the consecutive starting with
        this element.Iterate from arr[i] + 1 till the last element that can be found.
        If the count is more than the previous longest subsequence found, then update this.*/

        int[] arr = {100,4,200,1,3,2};

        // Add to set for look up
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach( e -> set.add(e));

        int resCounter = 0;

        // Iterate over the loop
        for(int i=0; i<arr.length; i++) {

            // Check if the previous number(if 100 is current then check for 99)
            // is in the list if not this is the start of sequence.
            if(!set.contains(arr[i] -1) ) {
                int tempCounter = 0;
                // Check fo current and next numbers in the set and increment counter.
                while(set.contains(arr[i] + tempCounter))
                    tempCounter++;

                // Reset counter to the max value.
                resCounter = Math.max(resCounter, tempCounter);
            }
        }

        System.out.printf("Result: "+resCounter);
    }
}
