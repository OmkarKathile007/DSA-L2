package Stacks;

import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean IsValidParanthesis(String str){
        Stack<Character> chr=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while (chr.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }
            else {
                chr.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        System.out.println(IsValidParanthesis(str));

    }
}
