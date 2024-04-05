package com.sample.hackerrank.arrays;

//Finding all subsets of a given set in Java

/*
Input:
        S = {a, b, c, d}
        Output:
        {}, {a} , {b}, {c}, {d}, {a,b}, {a,c},
        {a,d}, {b,c}, {b,d}, {c,d}, {a,b,c},
        {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}
*/

import java.util.ArrayList;
import java.util.List;

/*Input: N = 3, Arr = [1, 2, 3]
        Output: {}
        {1}
        {1, 2}
        {1, 2, 3}
        {1, 3}
        {2}
        {2, 3}
        {3}*/
public class H17_SubsetArray {
    public static void main(String[] args) {

        // Solution1: Using binary
        // https://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/

        // Solution2: Using backtracking & recursion
        // https://www.geeksforgeeks.org/backtracking-to-find-all-subsets/
    }

    // Solution 1 : using binary
    // check youtube screen shot - girl
    // Print all subsets of given set[]
    static void printSubsets(char set[]) {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{ ");

            //String binaryString = Integer.toBinaryString(1);

            // Print current subset
            for (int j = 0; j < n; j++)


                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
/*                The symbol & denotes the bitwise AND operator. It evaluates the binary value of given numbers.
            The binary result of these numbers will be returned to us in base 10.*/
                 //i: 101
                 //j: 001
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }


    // Solution 2: back tracking & recursion
    public static void calcSubset(List<Integer> A,
                                  List<List<Integer> > res,
                                  List<Integer> subset,
                                  int index)
    {
        // Add the current subset to the result list
        res.add(new ArrayList<>(subset));

        // Generate subsets by recursively including and
        // excluding elements
        for (int i = index; i < A.size(); i++) {
            // Include the current element in the subset
            subset.add(A.get(i));

            // Recursively generate subsets with the current
            // element included
            calcSubset(A, res, subset, i + 1);

            // Exclude the current element from the subset
            // (backtracking)
            subset.remove(subset.size() - 1);
        }
    }
}
