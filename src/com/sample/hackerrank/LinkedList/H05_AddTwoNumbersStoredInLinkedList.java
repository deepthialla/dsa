package com.sample.hackerrank.LinkedList;

// Given two numbers represented by two lists, write a function that returns the sum in the form of a linked list.

/*Input:
        List1: 5->6->3 // represents number 563
        List2: 8->4->2 // represents number 842
        Output:
        Resultant list: 1->4->0->5 // represents number 1405
        Explanation: 563 + 842 = 1405

        Input:
        List1: 7->5->9->4->6 // represents number 75946
        List2: 8->4 // represents number 84
        Output:
        Resultant list: 7->6->0->3->0// represents number 76030
        Explanation: 75946+84=76030*/
public class H05_AddTwoNumbersStoredInLinkedList {
    public static void main(String[] args) {

        // First linked list
        LinkedList1 first = new LinkedList1();
        first.push(6);
        first.push(4);
        first.push(9);
        first.push(8);


        // Second linked list
        LinkedList1 second = new LinkedList1();
        second.push(4);
        second.push(8);

        int num1 = 0;
        int num2 = 0;

        // Navigate over first linked list and prepare first number. 123
        while(first.head != null) {
            num1 = num1 * 10 + first.head.data;
            first.head = first.head.next;
        }

        // Navigate over second linked list and prepare second number. 456
        while(second.head != null) {
            num2 = num2 * 10 + second.head.data;
            second.head = second.head.next;
        }

        // Add two numbers
        int num3 = num1 + num2;

        // Prepare result as a linked list.
        LinkedList1 resultList = new LinkedList1();
        while (num3 != 0) {
            int last = num3 % 10;
            resultList.push(last);
            num3 = num3 / 10;
        }

        resultList.printList();
    }
}

class Node {
    int data;
    Node next;

    Node arbit;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


class LinkedList1 {
    Node head;

    LinkedList1() { head = null; }

    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}


