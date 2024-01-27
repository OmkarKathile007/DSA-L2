package BackTracking;

public class P3_PermutationString {
    public static void Permutation(String str,String newstr){
        if (str.length()==0){
            System.out.println(newstr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String update=str.substring(0,i)+str.substring(i+1);
            Permutation(update,newstr+currchar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        Permutation(str,"");
    }
}
