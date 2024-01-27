package GreedyAlogrithm;

public class PartitionString {
    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        int L=0;
        int R=0;
        int Partition=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='L'){
                L++;
            }
            else if (str.charAt(i)=='R'){
                R++;
            }
            if (L==R){
               Partition++;
            }
        }
        System.out.println(Partition);
    }
}
