package PracticeDATAStruct;

import com.sun.net.httpserver.Headers;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void AddFirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=tail=newnode;
            return;
        }

        newnode.next= head;
        head=newnode;

    }
    public void Print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");

    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.AddFirst(32);
        ll.AddFirst(45);
        ll.Print();
    }
}
