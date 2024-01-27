package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void PushAtBottom(Stack<Integer> s1,int data){
        if (s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top=s1.pop();
        PushAtBottom(s1,data);
        s1.push(top);
    }
    public static void Reverse(Stack<Integer> s){
        Stack<Integer> s1 = new Stack();
        while(s.isEmpty()){
            int val=s.pop();
            s1.push(val);
        }

    }

    public static void StackREV(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top=s.pop();
        StackREV(s);
        PushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(12);
        s.push(14);
        s.push(18);
        s.push(20);

//        while (!s.isEmpty()){
//            int val=s.pop();
//            System.out.println(val);
//
//        }
//        System.out.println("REVERSE THE STACK");
//        Reverse(s);
//        while (!s.isEmpty()){
//            int val=s.pop();
//            System.out.println(val);
//        }
        StackREV(s);
        while (!s.isEmpty()){
            int val=s.pop();
            System.out.println(val);

        }
    }
}
