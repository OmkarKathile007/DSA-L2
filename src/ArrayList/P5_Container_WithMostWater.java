package ArrayList;

import java.util.ArrayList;

public class P5_Container_WithMostWater {

    // O(n^2) Brute force Approach
    public static int TrapWater(ArrayList<Integer> al ){
        int maxWater=0;
        for (int i=0;i<al.size();i++){
            for (int j=i+1;j<al.size();j++){
                int ht=Math.min(al.get(i),al.get(j));
                int width=j-i;
                int area=ht*width;
                maxWater=Math.max(area,maxWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(8);
        al.add(6);
        al.add(2);
        al.add(5);
        al.add(4);
        al.add(8);
        al.add(3);
        al.add(7);
        System.out.println(TrapWater(al));
    }
}
