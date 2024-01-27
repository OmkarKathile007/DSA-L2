package Deque;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ImplementStack {
    public static class Stack{
        static Deque<Integer> de=new LinkedList<>();

        public static boolean isEmpty(){
            return de.isEmpty();
        }

        public static void push(int data){
            de.addLast(data);
        }
        public static int pop(){
            if(de.isEmpty()){
                System.out.println("Dequeue is Empty");
                return -1;
            }
            int data=de.getLast();
            de.removeLast();
            return data;
        }
        public static int Peek(){
            if(de.isEmpty()){
                System.out.println("Dequeue is Empty");
                return -1;
            }
            int data=de.getLast();
            return data;

        }


    }

    public static void main(String[] args) {
         Stack s = new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         while (!s.isEmpty()){

             System.out.println(s.Peek());
             s.pop();
         }
    }
}
