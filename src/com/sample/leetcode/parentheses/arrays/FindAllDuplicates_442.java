package com.sample.leetcode.parentheses.arrays;

// 442. Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums of length n where all the integers of nums are in
 * the range [1, n] and each integer appears once or twice, return an array of all the integers
 * that appears twice.
 *
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 *
 */
public class FindAllDuplicates_442 {
    public static void main(String[] args) {
        // Idea: derive index from value and update the value at that index to negative.
        // If negative value is already present at that index then it's a duplicate.
        int[] nums = {4,3,2,7,8,2,3,1};
      List<Integer> duplicates = new ArrayList<>();

      for(int i=0; i<nums.length ; i++) {
          int index = Math.abs(nums[i]) - 1; // Derive index from value
          if(nums[index] < 0)  { // Check if the value at that index is already negative.
              duplicates.add(nums[i]); // if yes, that is duplicate and add it to output array
              // duplicates.add(index + 1);
          }
          nums[index] = -nums[index]; // Update value at that index to negative.
      }

        System.out.println(duplicates);
    }
}
