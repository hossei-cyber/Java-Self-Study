package Linkedlist;

class LinkedListexample {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }public static void main(String[] args){
        LinkedListexample llist = new LinkedListexample();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        System.out.println("Linked List: " + llist.head.data + " " + second.data + " " + third.data);
    }
}
