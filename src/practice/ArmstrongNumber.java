package practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in =new Scanner(System.in);
        int num= in.nextInt();
        if(isArmstrong(num)){
            System.out.println("ArmStrong Number.");
        }else{
            System.out.println("Not A Armstrong Number.");
        }
    }
    static boolean isArmstrong(int num){
        int original=num;
        int noOFDigits=String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=(int)Math.pow(rem,noOFDigits);
            num=num/10;
        }
        return sum==original;
    }
}
