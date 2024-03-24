package com.sample.hackerrank.arrays;

/*You are given an array of integers of size n . Find a subarray whose sum of elements is as minimum as possible .
        Print the sum of elements of that subarray.*/

/*Note : A subarray is consisted of some consecutive elements of an array .
        For example, if we consider an array {1,3,22,8} , then {1,3} or {3,22,8} will be subarray of this
        array , but {1,8} or {1,22,8} won't be .*/

public class H08_MinimumSubArraySum {
    public static void main(String[] args1) {

        String[] args = {"1"};
        // Kadane's algorithm

     /*   The idea of Kadane’s algorithm is to maintain a variable min_ending_here that stores the minimum sum contiguous
        subarray ending at current index and a variable min_so_far stores the minimum sum of contiguous subarray
        found so far, Everytime there is a positive -sum value in min_ending_here compare it with min_so_far and
        update min_so_far if it is lesser than min_so_far.*/

        int min_ending_here = 0;
        int min_so_far = Integer.MAX_VALUE;  // To cover negative integers

        for (int i = 0; i < args.length; i++) {

            Integer current = Integer.parseInt(args[i]);

            // Add the current number
            min_ending_here = min_ending_here + current;

            // If max ending at current element < current, update max ending to current
            if (min_ending_here > current)
                min_ending_here = current;

            // If max so far < max ending here, update max so far with max ending here.
            if (min_so_far > min_ending_here)
                min_so_far = min_ending_here;

        }

        System.out.println(min_so_far);
    }
}
