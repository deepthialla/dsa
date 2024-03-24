package com.sample.hackerrank.arrays;

/*Given an array of N distinct integers. The task is to write a program to check if this array is sorted and rotated clockwise.

        Note: A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation*/

/*Input: arr[] = { 3, 4, 5, 1, 2 }
        Output: YES
        Explanation: The above array is sorted and rotated
        Sorted array: {1, 2, 3, 4, 5}
        Rotating this sorted array clockwise
        by 3 positions, we get: { 3, 4, 5, 1, 2}*/
public class H07_SortedAndRotatedArray {
    public static void main(String[] args) {

/*        Follow the given steps to solve the problem:

        Take two variables to say x and y, initialized as 0
        Now traverse the array
        If the previous element is smaller than the current, increment x by one
        Else increment y by one.
                After traversal, if y is not equal to 1, return false.
                Then compare the last element with the first element (0th element as current, and last element as previous.) i.e. if the last element is greater increase y by one else increase x by one
        Again check if y equals one return true. i.e. Array is sorted and rotated. Else return false*/

        int arr[] = { 3, 4, 5, 1, 2 };
        int x = 0, y =0;

        int arrLength = arr.length;

        for(int i=0; i < arr.length; i++ ) {

            // If current < next increment x otherwise y.
            if(arr[i] < arr[i+1])
                x++;
            else y++;

            // If y = 1, then sorted rotated for now.
            if(y == 1) {
                // Check for last num & first num. should be less
                if(arr[ arrLength -1] < arr[0])
                    x++;
                else
                    y++;

                // If Y is still 1, then true.
                if(y == 1) {
                    //return true;
                    System.out.println("sorted and rotated");
                }
            }
        }

        // Above not met then false.
        //return false;
        System.out.println("Not sorted and rotated");
    }
}
