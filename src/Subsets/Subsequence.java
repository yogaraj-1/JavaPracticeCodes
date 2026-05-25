package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        String str ="abc";
       ArrayList<String> ans= SubseqInList("",str);
        System.out.println(ans);
    }
    //this function to print subsequences as separate strings
   /* public static void Subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Subseq(p+ch,up.substring(1));
        Subseq(p,up.substring(1));
    }*/

    //this function to print subsequences as separate list
    public static ArrayList<String> SubseqInList(String p,String up) {
        if (up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
       ArrayList<String> left=SubseqInList(p + ch, up.substring(1));
        ArrayList<String> right=SubseqInList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
