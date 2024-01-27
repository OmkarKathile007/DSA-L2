package ArrayList;

import java.util.ArrayList;

public class P10_MostFreqNum {
    public static void MostFreq(ArrayList<Integer> al,int target,int key){
        int count1=0,count2=0;
        int gr1=0,gr2=0;
        for (int i=0;i<al.size()-1;i++){
            if (al.get(i)==key){
                count1++;
                gr1=al.get(i);
            }
            if (al.get(i+1)==target){
                count2++;
                gr2=al.get(i);
            }
        }
        if (count1>=count2 && gr1>gr2){
            System.out.println(key);
        }
        else{
            System.out.println(target);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(100);
        al.add(1);
        al.add(200);
        MostFreq(al,100,200);
    }
}
