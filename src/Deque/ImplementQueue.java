package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementQueue {

    public static class Queue{
        static Deque<Integer> de = new LinkedList<>();

        public static boolean isEmpty(){
            return de.isEmpty();
        }
        public static void add(int data){
            de.addLast(data);
        }

        public static int remove(){
            if(de.isEmpty()){
                return -1;
            }
            int data=de.getFirst();
            de.removeFirst();
            return data;
        }

        public static int peek(){
            if(de.isEmpty()){
                return -1;
            }
            int data=de.getFirst();
            return data;
        }
    }
    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
