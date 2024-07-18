package Linkedlist;
import java.util.*;
public class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
class main{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        head = insertAtBegin(head, 5);
        printList(head);
        insertAtEnd(head, 70);
        printList(head);
        insertAfter(head.next, 78);
        printList(head);
        head = removeFirst(head);
        printList(head);
        removeLast(head);
        printList(head);



    }
    public static void printList(Node head){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data + " " );
            curr = curr.next;
        }
        System.out.println();
    }
    public static int getCount(Node head) {
        // code here
        int count = 0;
        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public static void rPrint(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
    public static Node insertAtBegin(Node head, int data) {

        Node temp = new Node(data);
        if(head == null){
            temp = head;
        }
        temp.next = head;
        head = temp;
        return head;
    }
    public static Node insertAtEnd(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            temp = head;
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = null;
        return temp;
    }
    public static Node insertAfter(Node prev_node, int new_data){
        Node temp = new Node(new_data);
        if(prev_node == null){
            throw new RuntimeException("prev cant be null");
        }
        temp.next = prev_node.next;
        prev_node.next = temp;
        return temp;

    }
    public static Node removeFirst(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }
    public static Node removeLast(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return curr;
    }
}
