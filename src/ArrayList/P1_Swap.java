package ArrayList;

import java.util.ArrayList;

public class P1_Swap {
    public static void Swap(ArrayList<Integer> al,int idx1,int idx2){
        int temp=al.get(idx1);
        al.set(idx1,idx2);
        al.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(5);
        al.add(9);
        al.add(3);
        al.add(6);

        System.out.println(al);
        Swap(al,1,3);
        System.out.println(al);
//
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        System.out.println(al);
//        al.set(0,2);
//        System.out.println(al);


    }
}
