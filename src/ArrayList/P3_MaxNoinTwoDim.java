package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class P3_MaxNoinTwoDim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(5);

        list3.add(4);
        list3.add(5);
        list3.add(7);
        list3.add(1);

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        int max = Integer.MIN_VALUE;

        for (int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist=mainlist.get(i);
            for (int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
                max=Math.max(max,currlist.get(j));
            }
            System.out.println();
        }
        System.out.println("Max Element in MainList :"+max);


    }
}
