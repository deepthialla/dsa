package com.sample.hackerrank.LinkedList;

public class H13_RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        // Solution: https://www.geeksforgeeks.org/remove-duplicates-from-a-sorted-linked-list/


    }

    // Method1: without recursion
    void removeDuplicates(Node head)
    {
        /*Another reference to head*/
        Node curr = head;

        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and
            keep on deleting them until it matches the
            current node data */
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }

    // Method2: with recursion

    // The function removes duplicates
    // from a sorted list
    static Node removeDuplicatesWithRecursion(Node head)
    {
        /* Pointer to store the pointer
        of a node to be deleted*/
        Node to_free;

        /* do nothing if the list is empty */
        if (head == null)
            return null;

        /* Traverse the list till last node */
        if (head.next != null) {

            /* Compare head node with next node */
            if (head.data == head.next.data) {
                /* The sequence of steps is important.
                to_free pointer stores the next of head
                pointer which is to be deleted.*/
                to_free = head.next;
                head.next = head.next.next;
                removeDuplicatesWithRecursion(head);
            }

            /* This is tricky: only advance if no deletion
             */
            else {
                removeDuplicatesWithRecursion(head.next);
            }
        }
        return head;
    }
}
