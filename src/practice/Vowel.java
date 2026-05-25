package practice;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Word:");
         String a=scan.nextLine();
        vowel(a);
    }
    static void vowel(String str){
        int vcount=0;
        int ccount=0;
        for(int i=0;i<str.length();i++) {
            char a=str.charAt(i);
            if (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U') {
                vcount++;
            } else {
               ccount++;
            }
        }
        System.out.println("Total Vowel:"+vcount);
        System.out.println("Total consonant:"+ccount);
    }
}
