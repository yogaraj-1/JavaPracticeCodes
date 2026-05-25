package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter: ");
        int n=in.nextInt();
        pattern1(n);
    }
    public static void pattern1(int n){
        for(int i=1;i<=2*n;i++){
            int totalCols= i>n ? 2*n-i : i;
            int space=n-totalCols;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int j=0;j<totalCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
