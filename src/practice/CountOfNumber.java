package practice;

import java.util.Scanner;

public class CountOfNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= in.nextInt();
        System.out.println("Enter which digit: ");
        int digit=in.nextInt();
        int count =0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            if(rem==digit) {
                count++;
            }
        }
        System.out.printf("The digit %d has occured %d times in the Number %d.\n",digit,count,num);
    }
}
