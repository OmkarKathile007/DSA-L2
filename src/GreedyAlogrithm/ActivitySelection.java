package GreedyAlogrithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        int activites[][]=new int[start.length][3];
        for (int i=0;i<activites.length;i++){
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        }
        Arrays.sort(activites, Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> al = new ArrayList<>();
        int maxAct=0;
        int lastEnd=activites[0][2];
        al.add(activites[0][0]);
        for (int i=1;i<activites.length;i++){
            if (activites[i][1]>=lastEnd){
                al.add(i);
                lastEnd=activites[i][2];
                maxAct++;


            }
        }
        System.out.println("Total number of Activites :"+maxAct);
        for (int i=0;i<al.size();i++){
            System.out.print("A"+al.get(i)+" ");
        }

    }
}
