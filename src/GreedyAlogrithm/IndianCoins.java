package GreedyAlogrithm;

import Queue.UsingLinkedList;

import java.net.Inet4Address;
import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,50,20,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int TotalNotes=0;
        ArrayList<Integer> Notes=new ArrayList<>();
        int Amount=679;
        int amt=Amount;
        for (int i=0;i< coins.length;i++){
            if (coins[i]<Amount){
                while (coins[i]<=Amount){
                    TotalNotes++;
                    Amount=Amount-coins[i];
                    Notes.add(coins[i]);

                }
            }
        }
        System.out.println(amt);
        System.out.println("Total Notes/Coins used :"+TotalNotes);
        System.out.println("Types of Notes Used :"+Notes);



    }
}
