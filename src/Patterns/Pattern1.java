package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    public static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern5(int n){
        int val=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(val+" ");
            }
            val--;

            System.out.println();
        }

    }

    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("* ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*n)-(2*i)+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void pattern8(int n){
        for(int i=1;i<=2*n;i++){
            int totalCols= i>n ? 2*n-i : i;
            for(int j=0;j<totalCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern7(5);
    }
}
