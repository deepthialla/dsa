package com.sample.hackerrank.LinkedList;


import java.util.HashMap;

/*
Given a linked list of size N where each node has two links:one pointer points to
the next node and the second pointer points to any node in the list.The task is to
create a clone of this linked list in O(N)time.

        Note:The pointer pointing to the next node is ‘next‘ pointer and the one
        pointing to an arbitrary node is called ‘arbit’ pointer as it can point to
        any arbitrary node in the linked list.

*/
public class H15_CopyLinkedListWithArbitraryPointer {
    public static void main(String[] args) {
        // Solution: https://www.geeksforgeeks.org/a-linked-list-with-next-and-arbit-pointer/

/*        First create a single linked list with only the ‘next’ pointer and use a mapping to map the new nodes to
        their corresponding nodes in the given linked list. Now use this mapping to point the arbitrary node from
        any node in the newly created list.*/

/*        Follow the steps mentioned below to implement the above idea:

        Create a duplicate (say Y) for each node (say X) and map them with corresponding old nodes (say mp, So mp[X] = Y).
                Create the single linked list of the duplicate nodes where each node only has the ‘next’ pointer.
                Now iterate over the old linked list and do the following:
        Find the duplicate node mapped with the current one. (i.e., if the current node is X then duplicate is mp[x])
        Make the arbit pointer of the duplicate node pointing to the duplicate of the current->arbit node (i.e., mp[x]->arbit will point to mp[X->arbit]).
        The linked list created in this way is the required linked list.*/

        // Clone a Linked List with next and Random Pointer using Extra Space(HashMap):
    }


    static Node cloneLinkedList(Node head)
    {
        // Map to store the mapping of
        // old nodes with new ones
        HashMap<Node, Node> mp = new HashMap<>();
        Node temp, nhead;

        // Duplicate of the first node
        temp = head;
        nhead = new Node(temp.data);
        mp.put(temp, nhead);

        // Loop to create duplicates of nodes
        // with only next pointer
        while (temp.next != null) {
            nhead.next = new Node(temp.next.data);
            temp = temp.next;
            nhead = nhead.next;
            mp.put(temp, nhead);
        }
        temp = head;

        // Loop to clone the arbit pointers
        while (temp != null) {
            mp.get(temp).arbit = mp.get(temp.arbit);
            temp = temp.next;
        }

        // Return the head of the clone
        return mp.get(head);
    }

    static void printList(Node head)
    {
        System.out.print(head.data + "(" + head.arbit.data
                + ")");
        head = head.next;
        while (head != null) {
            System.out.print(" -> " + head.data + "("
                    + head.arbit.data + ")");
            head = head.next;
        }
        System.out.println();
    }
}
