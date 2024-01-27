package GreedyAlogrithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class FrcationalKnapsack {
    public static void main(String[] args) {
        int Weight[]={10,20,30};
        int Value[]={60,100,120};

        double ratio[][]=new double[Weight.length][2];
        for (int i=0;i<Weight.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=Value[i]/(double)Weight[i];
        }

        Arrays.sort(ratio,Comparator.comparing(o->o[1]));
        int finalValue=0;
        int Capacity=50;
        for (int i= Weight.length-1;i>=0;i--){
            int index=(int) ratio[i][0];
            if (Capacity>=Weight[index]){
                finalValue+=Value[index];
                Capacity=Capacity-Weight[index];
            }
            else{
                finalValue+=(ratio[i][1]*Capacity);
                Capacity=0;
                break;
            }
        }
        System.out.println(finalValue);


    }
}
