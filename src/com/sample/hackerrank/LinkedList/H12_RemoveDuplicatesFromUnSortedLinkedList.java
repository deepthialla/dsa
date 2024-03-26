package com.sample.hackerrank.LinkedList;

import java.util.HashSet;

public class H12_RemoveDuplicatesFromUnSortedLinkedList {
    public static void main(String[] args) {
        // Solution: https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/

/*
        Traverse the link list from head to end.
        For every newly encountered element, check whether if it is in the hash table:
        if yes, remove it
        otherwise put it in the hash table.
                At the end, the Hash table will contain only the unique elements.
*/

    }

    static void removeDuplicate(Node head) {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    /* Function to print nodes in a given linked list */
    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
