package Queue;

import Stacks.UsingLinkedList;

import java.util.Stack;

public class Using2Stack_Queue {
    public static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();


       public static boolean isEmpty(){
           return s1.isEmpty();
       }
        public static void push(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s2.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }

        public static int pop(){
            if (s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int pop=s1.peek();
            s1.pop();
            return pop;

        }

    }



    public static void main(String[] args) {
        Queue q= new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}
