package GreedyAlogrithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencing {
    public static class Jobs{
        int id;
        int deadline;
        int profit;

        Jobs(int i,int p,int d){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int JobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Jobs> jobs = new ArrayList<>();
        for(int i=0;i< JobsInfo.length;i++){
            jobs.add(new Jobs(i,JobsInfo[i][0],JobsInfo[i][1]));
        }




        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        for (int i=0;i< JobsInfo.length;i++){
            for (int j=0;j< JobsInfo[0].length;j++){
                System.out.print(jobs.get(i).deadline+" "+jobs.get(i).profit);
            }
            System.out.println();
        }
//        ArrayList<Integer> seq=new ArrayList<>();
//        int time=0;
//        for (int i=0;i< jobs.size();i++){
//            Jobs curr=jobs.get(i);
//            if(curr.deadline>time){
//
//                seq.add(curr.id);
//                time++;
//            }
//        }
//
//        System.out.print(seq.size());
//        for (int i=0;i<seq.size();i++){
//            System.out.print(seq.get(i)+" ");
//        }


    }
}
