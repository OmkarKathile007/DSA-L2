package GreedyAlogrithm;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int K=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<1000;i++){
            if (L==R){
                al.add(L);
                break;
            }

            al.add(L);
            L=L+1;

        }
        int k=0;
        ArrayList<Integer> num=new ArrayList<>();
//        al.remove(al.size()-1);
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++){

            if (Math.abs(al.get(i))%2!=0 ){
                num.add(al.get(i));
            }
        }


        System.out.println(num);
        Collections.sort(num ,Collections.reverseOrder());
        System.out.println(num);
        if(k>al.size()){
            System.out.println(-1);
        }
        else{
            try {
                System.out.println(num.get(K-1));
            }
            catch (Exception e){
                System.out.println("INDEXOUT OF BOUND");
            }

        }


    }
}
