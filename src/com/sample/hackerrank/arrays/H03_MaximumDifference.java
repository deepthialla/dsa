package com.sample.hackerrank.arrays;

// Find the maximum diff.
// https://www.hackerrank.com/contests/coding-gym-mi0420/challenges/find-the-maximum-difference/problem
// You are given a sequence of integers S, your task is to find a pair i,j of
// indices with i<j that maximizes the difference S[j]-S[i].
public class H03_MaximumDifference {
    public static void main(String[] args) {

/*      In this method, instead of taking difference of the picked element with every other element, we take
        the difference with the minimum element found so far. So we need to keep track of 2 things:
        1) Maximum difference found so far (max_diff).
        2) Minimum number visited so far (min_element).*/

        int[] arr = {1, 2, 90, 10, 110};

        int arrLength = arr.length;

        int max_diff = arr[1] - arr[0]; // Initial max diff between first two elements
        int min_element = arr[0]; // min element is first element

        for (int i = 1; i < arrLength; i ++) {
            if((arr[i] - min_element) > max_diff) // If diff b/w current and min > max
                max_diff = arr[i] - min_element; // Update max

            if(arr[i] < min_element) // if current element < min ele
                min_element = arr[i]; // Update min element
        }
        System.out.printf("Max diff:"+max_diff);
    }
}
