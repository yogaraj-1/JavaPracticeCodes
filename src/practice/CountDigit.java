package practice;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
       int digit= count(num);
       boolean P=isPrime(num);
        System.out.println("The Digit:"+digit);
        if(P==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");
        }

    }
    public static int count(int num){
        return (int)Math.log10(num)+1;
    }
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
