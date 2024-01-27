package BackTracking;

import java.util.ArrayList;
import java.util.Collections;

public class P4_Divide {
    public static void PrintArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void DivideArray(int arr[], int i, ArrayList<Integer> al){
        if (i>= arr.length){
            return;
        }
        DivideArray(arr,i+1,al);
        al.add(arr[i]/2);
        if(i==0){
            Collections.sort(al);
            System.out.println(al);
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        DivideArray(arr,0,new ArrayList<Integer>());
    }
}
