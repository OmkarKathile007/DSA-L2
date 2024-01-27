package Stacks;

import java.util.Stack;

public class UsingLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newnode = new Node(data);
            if (isEmpty()){
                head=newnode;
                return ;
            }
            newnode.next=head;
            head=newnode;

        }

        public static int pop(){

            if (isEmpty()){
                return -1;
            }
            int val=head.data;
            head=head.next;
            return val;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {

       Stack s= new Stack();
       s.push(1);
       s.push(2);
       s.push(3);

       while (!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
       }
       java.util.Stack s1=new java.util.Stack<Integer>();
       s1.push(1);
       s1.push(2);
       s1.push(3);
       s1.push(4);
       System.out.println(s1);




    }
}
