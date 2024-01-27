package GreedyAlogrithm;

import java.util.Arrays;

public class MinimumAbsoluteDiff {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        int arr1[]={3,2,1};

        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr);
        int maxsum=0;
        for (int i=0;i<arr.length;i++){
            maxsum+=Math.abs(arr1[i]-arr[i]);
        }
        System.out.println(maxsum);
    }
}
