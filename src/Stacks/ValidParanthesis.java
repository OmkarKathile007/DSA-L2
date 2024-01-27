package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean ValidBracket(String str1){
        Stack<Character> s1=new Stack<>();
        for (int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);

            if( ch=='(' || ch=='{'|| ch=='['){
                s1.push(ch);
            }
            else{
                if (s1.isEmpty()){
                    return false;
                }
                if (s1.peek()=='(' && ch==')' || s1.peek()=='{' && ch=='}' || s1.peek()=='[' && ch==']'){
                    s1.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="({})[]{";
        System.out.println(ValidBracket(str));
    }
}
