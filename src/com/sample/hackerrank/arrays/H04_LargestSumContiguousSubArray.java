package com.sample.hackerrank.arrays;

/*You will be given an array which consists of  elements.

        Your task is to calculate the Maximum Sum that can be formed by the sum of contiguous sub-array of any length.

        If all the elements of given array are negative, print Invalid Input*/
public class H04_LargestSumContiguousSubArray {
    public static void main(String[] args1) {

        String[] args = {"-2", "-3", "4", "-1",  "-2",  "1", "5", "-3"};
        // Kadane's algorithm

     /*   The idea of Kadane’s algorithm is to maintain a variable max_ending_here that stores the maximum sum contiguous
        subarray ending at current index and a variable max_so_far stores the maximum sum of contiguous subarray
        found so far, Everytime there is a positive -sum value in max_ending_here compare it with max_so_far and
        update max_so_far if it is greater than max_so_far.*/

        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;  // To cover negative integers

        boolean allValuesAreNeg = true;

        for (int i = 0; i < args.length; i++) {

            Integer current = Integer.parseInt(args[i]);

            // Check if current element negative or not
            if(current.intValue() >= 0)
                allValuesAreNeg = false;

            // Add the current number
            max_ending_here = max_ending_here + current;

            // If max ending at current element < current, update max ending to current
            if (max_ending_here < current)
                max_ending_here = current;

            // If max so far < max ending here, update max so far with max ending here.
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

        }

        if(allValuesAreNeg)
            System.out.println("Invalid Input");
        else
            System.out.println(max_so_far);
    }
}
