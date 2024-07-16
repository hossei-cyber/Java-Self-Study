package Linkedlist;

class LinkedList2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAfter(Node prev_node,  int new_data){
        if(prev_node == null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);

        new_node.next = prev_node.next;

        prev_node.next = new_node;
    }
    public void append(int new_data){
        Node new_node = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next = null;

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList2 list = new LinkedList2();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        list.printList();
        list.push(5);
        list.printList();
        list.insertAfter(second, 80);
        list.printList();
        list.append(100);
        list.printList();
    }
}
