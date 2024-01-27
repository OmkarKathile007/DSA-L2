package Stacks;

import java.util.Stack;

public class PushbottomElement {


    // It will store at Bottom of Stack
    public static void PushAtBottom(Stack<Integer> s1,int data){
        if (s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top=s1.pop();
        PushAtBottom(s1,data);
        s1.push(top);
    }
     public static String Reverse(String str){
        Stack<Character> s = new Stack<>();
        int indx=0;
        while (indx<str.length()){
            s.push(str.charAt(indx));
            indx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }
        return sb.toString();
     }

    public static void main(String[] args) {
        Stack s1=new Stack();
//        s1.push(2);
//        s1.push(3);
//        s1.push(4);
//        PushAtBottom(s1,9);
//        while (!s1.isEmpty()){
//            System.out.println(s1.peek());
//            s1.pop();
//        }

        String s2=Reverse("abc");
        System.out.println(s2);







    }
}
