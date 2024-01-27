package ArrayList;

import java.util.ArrayList;

public class P8_MonotonicArray {
    public static boolean Monotone(ArrayList<Integer> al){
        boolean inc=true;
        boolean dec=true;
        for (int i=0;i<al.size()-1;i++){
            if(al.get(i)<al.get(i+1)){
                inc=false;
            }
            if (al.get(i)>al.get(i+1)){
                dec=false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(5);
        al.add(3);
        al.add(4);
        System.out.println(Monotone(al));

    }
}
