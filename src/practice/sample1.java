package practice;

import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num=in.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("The Sum of N numbers: "+sum);
    }

}
