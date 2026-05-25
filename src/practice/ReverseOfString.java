package practice;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(reverse(str));
    }
    static String reverse(String str){
        String a="";
        for(int i=str.length()-1;i>=0;i--){
            a+=str.charAt(i);
        }
        return a;
    }
}
