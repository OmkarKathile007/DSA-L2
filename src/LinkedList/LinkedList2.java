package LinkedList;

import java.awt.*;

public class LinkedList2 {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }

    }
    public static Node head;
    public static Node tail;
     static int size=0;
    public void add(int data){
        Node newnode = new Node(data);
        size++;
        if (head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void Print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void addFirst(int data){

        Node newnode = new Node(data);
        size++;
        if (head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode= new Node(data);
//        newnode.next=null;
        tail.next=newnode;
        tail=newnode;
        size++;

    }
    public int removeFirst(){
        if(size==0){
            return 0;
        }
        else if(size==1){
           int val=head.data;
           head=tail=null;
           size=0;
           return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int Helper(Node head,int key)
    {
       if(head==null){
           return -1;
       }
       if (head.data==key){
           return 0;
       }
       int indx=Helper(head.next,key);
       if(indx==-1){
           return -1;
       }
       return indx+1;

    }
    public Node FindMidNode(Node Head){
        Node slow=Head;
        Node fast=Head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public Node MergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=FindMidNode(head);
        Node right=mid.next;
        mid.next=null;
        Node lefthalf=MergeSort(head);
        Node Righthalf=MergeSort(right);

        return Merge(lefthalf,Righthalf);

    }
    public Node Merge(Node head1,Node head2){
        Node mergelist=new Node(-1);
        Node temp=mergelist;
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergelist.next;
    }
    public  int RecuSearch(int key){
        return Helper(head,key);
    }
    public static void main(String[] args) {
           LinkedList2 ll2 = new LinkedList2();
//           ll2.addFirst(56);
//           ll2.addFirst(62);
//           ll2.addFirst(78);
//
//           ll2.addFirst(21);
//           ll2.addFirst(90);
//           ll2.Print();
//           ll2.head= ll2.MergeSort(ll2.head);
//        System.out.println();
           ll2.Print();

//        System.out.println(ll2.RecuSearch(90));
//
//           ll2.Print();



        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(50);

        head=new Node(4);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=head.next.next.next=new Node(40);





    }
}
