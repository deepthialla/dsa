package com.sample.hackerrank.arrays;

import java.util.Arrays;

public class H16_MissingNumberInArray {
    public static void main(String[] args) {

        //Solution: https://www.baeldung.com/java-array-find-missing-number

        // #1: Using arth operation
        int numbers[] = {1, 2, 4, 6, 3, 7, 8};
        int N = numbers.length;

        int expectedSum = (N * (N + 1)) / 2;
        int actualSum = Arrays.stream(numbers).sum();

        int missingNumber = expectedSum - actualSum;



        // #2: Using sort

        Arrays.sort(numbers);

         missingNumber = -1;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] != index + 1) {
                missingNumber = index + 1;
                break;
            }
        }

    }
}
