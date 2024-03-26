package com.sample.hackerrank.other;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Given that integers are read from a data stream. Find the median of elements read so far in an efficient way.

        There are two cases for median on the basis of data set size.

        If the data set has an odd number then the middle one will be consider as median.
        If the data set has an even number then there is no distinct middle value and the median will be the arithmetic mean of the two middle values.
*/

/*Input Data Stream: 5, 15, 1, 3
        Output: 5, 10,5, 4
        Explanation:
        After reading 1st element of stream – 5 -> median = 5
        After reading 2nd element of stream – 5, 15 -> median = (5+15)/2 = 10
        After reading 3rd element of stream – 5, 15, 1 -> median = 5
        After reading 4th element of stream – 5, 15, 1, 3 -> median = (3+5)/2 = 4*/
public class H09_RunningStreamMedian {
    public static void main(String[] args) {

        // Solution: https://www.baeldung.com/java-stream-integers-median-using-heap

        Queue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder()); // first - high value first
        Queue<Integer> minHeap = new PriorityQueue<>(); // second - low value first

        int[] stream = {5, 15, 1, 3};

        for(int num : stream) {
            if( !(minHeap.isEmpty() && num < minHeap.peek()) ) {
                // Push to max heap/first and balance the sizes
                maxheap.offer(num);
                if(maxheap.size() > minHeap.size() + 1) {
                    minHeap.offer(maxheap.poll());
                }
            } else {
                // Push to min heap/second and balance the sizes
                minHeap.offer(num);
                if(minHeap.size() > maxheap.size() + 1) {
                    maxheap.offer(minHeap.poll());
                }
            }
        }

    }
}
