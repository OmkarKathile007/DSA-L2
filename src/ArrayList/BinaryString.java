package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(8);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="";
        for(int i= al.size()-1;i>=0;i--){
            if(al.get(i)<=n){
                str=str.concat("1");
                int Binary12=0;
                Binary12+=al.get(i);
                if(Binary12==n){
                    str=str.concat("1");
                    break;
                }
                else{
                    str=str.concat("0");
                }
            }
            else{
                str=str.concat("0");
            }
            System.out.println(str);
        }

    }
}
