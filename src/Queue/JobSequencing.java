package Queue;

import java.io.LineNumberReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


//**********************************8  WATCH EDITORIAL ANS IS WRONG   *********************************************
public class JobSequencing {
    public static void JobProfit(Queue<Integer> q1,Queue<Integer> q2){
        int maxProfit=Integer.MIN_VALUE;
        int maxDeadline=Integer.MIN_VALUE;
        int index1=0;
        int index2=0;

        ArrayList<Integer> profit = new ArrayList<>();
        ArrayList<Integer> Deadline = new ArrayList<>();
        for(int i=0;i<q1.size();i++){
            int n1=q1.peek();
            profit.add(n1);
            q1.remove();
            int n2=q2.peek();
            Deadline.add(n2);
            q2.remove();
        }
        Collections.sort(profit);
        Collections.sort(Deadline);

        for (int i=0;i<profit.size();i++){
            if(maxProfit<profit.get(i)){
                maxProfit=profit.get(i);
            }
            if(maxDeadline<Deadline.get(i)){
                maxDeadline= Deadline.get(i);
            }
        }

        char ch[]={'a','b','c','d'};
        System.out.println(ch[(profit.indexOf(maxProfit))+1]);
        System.out.println(ch[(Deadline.indexOf(maxDeadline))+1]);


    }
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();
        q1.add(20);
        q1.add(10);
        q1.add(40);
        q1.add(30);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(4);
        q2.add(1);
        q2.add(1);
        q2.add(1);

        JobProfit(q1,q2);

    }
}
