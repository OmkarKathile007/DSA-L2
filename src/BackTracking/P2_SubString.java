package BackTracking;

public class P2_SubString {
    public static void StringSub(String str,String newstr,int i){
        if (i==str.length()){
            System.out.print(newstr+" ");
            return;
        }
        StringSub(str,newstr+str.charAt(i),i+1);
        StringSub(str,newstr,i+1);
    }

    public static void main(String[] args) {
        String str="abc";
        StringSub(str,"",0);

    }
}
