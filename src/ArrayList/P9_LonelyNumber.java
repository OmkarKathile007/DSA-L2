package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class P9_LonelyNumber {
    public static ArrayList LoneNumber(ArrayList<Integer> al)
    {
        Collections.sort(al);
        ArrayList<Integer> al2=new ArrayList<>();
        for (int i=0;i<al.size();i++){
            al2.add(al.get(i));
        }
        for (int i=1;i<al.size()-2;i++){
            if (al.get(i)!=al.get(i+1)-1 || al.get(i)!=al.get(i+1)+1 ||al.get(i)==al.get(i+1) ){
                al2.remove(al2.get(i));
            }
            if (al.get(i)!=al.get(i-1)-1 || al.get(i)!=al.get(i+1)-1||al.get(i)==al.get(i-1)){
                al2.remove(al2.get(i));
            }
        }
        return al2;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(6);
        al.add(5);
        al.add(8);
        System.out.println(LoneNumber(al));

    }
}
