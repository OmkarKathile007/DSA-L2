package Stacks;

import java.util.Stack;
///  WRONG SOLUTION
public class PallindromeLinkedList {
    public static class Node{
        char data;
        Node next;

        Node(char data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public  void addLast(char data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public  void addFirst(char data){
        Node newnode = new Node(data);
        if (head==null){
            head=tail=newnode;
        }
        newnode.next=head;
        head=newnode;
    }

    public static void printlist(){
        if (head==null){
            System.out.println("LinkedList is Empty");
        }
        while (head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.println("null");
    }
    public  static void CheckPallindrome(PallindromeLinkedList pl,Node head){
        Stack<Character> ch=new Stack<>();
        if (head==null){
            System.out.println("Empty");
            return;
        }
        Node curr=head;
        while (curr!=null){
            char c= curr.data;
            ch.push(c);
            curr=curr.next;
        }

        boolean flag=false;
        while (!ch.isEmpty() && curr!=null){

             if (ch.peek()!=curr.data) {
                 System.out.println("LinkedList is Not Pallindrome");
                break;
            }
             else if (ch.peek()==curr.data){
                 System.out.println("Pallindrome");
                 break;
             }
            ch.pop();
             curr=curr.next;
        }
    }

    public static void main(String[] args) {
        PallindromeLinkedList pl=new PallindromeLinkedList();



        head=new Node('A');
        head.next=new Node('B');
        head.next.next=new Node('C');
        head.next.next.next=new Node('A');
        head.next.next.next.next=new Node('A');

        CheckPallindrome(pl,head);
    }
}
