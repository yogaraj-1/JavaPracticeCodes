package practice;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers:");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int gcd=GCD(num1,num2);
        System.out.println(gcd);
}
    public static int GCD(int a,int b){
        while((a%=b)!=0 && (b%=a)!=0){}
            return a+b;
        }
    }

