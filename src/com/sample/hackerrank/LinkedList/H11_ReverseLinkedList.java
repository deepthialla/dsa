package com.sample.hackerrank.LinkedList;

public class H11_ReverseLinkedList {
    public static void main(String[] args) {
        //Solution1: https://www.geeksforgeeks.org/reverse-a-linked-list/

/*        Initialize three pointers prev as NULL, curr as head, and next as NULL.
                Iterate through the linked list. In a loop, do the following:
        Before changing the next of curr, store the next node
                next = curr -> next
        Now update the next pointer of curr to the prev
        curr -> next = prev
        Update prev as curr and curr as next
        prev = curr
        curr = next*/

        Node node = null; // from input

        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;

        // return node;

        // Print nodes

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Solution2: using recursion

/*    Divide the list in two parts – first node and rest of the linked list.
    Call reverse for the rest of the linked list.
    Link the rest linked list to first.
    Fix head pointer to NULL*/
    static Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverse(head.next);
        head.next.next = head;

        /* tricky step -- see the diagram */
        head.next = null;

        /* fix the head pointer */
        return rest;
    }


    // Solution 3: https://medium.com/outco/reversing-a-linked-list-easy-as-1-2-3-560fbffe2088

/*    function reverse(head) {
// Step 1
        let previous = null
        let current = head
        let following = head
// Step 2
        while(current !== null) {
            following = following.next
            current.next = previous
            previous = current
            current = following
        }
// Step 3
        return previous
    }*/
}

