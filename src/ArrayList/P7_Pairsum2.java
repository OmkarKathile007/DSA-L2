package ArrayList;

import java.util.ArrayList;

public class P7_Pairsum2 {
    public static void PairSum(ArrayList<Integer> al,int target){
        int bp=0;
        for(int i=0;i<al.size();i++){
            if (al.get(i)>al.get(i+1)){
                    bp=i;
                    break;
                }

        }
        int lp=bp+1;
        int rp=bp;
        while (lp!=rp){
            if (al.get(lp)+al.get(rp)==target){

            }
            else{

            }
        }

    }
    public static void main(String[] args) {

    }
}
