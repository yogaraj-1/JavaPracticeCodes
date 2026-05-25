package practice;

import java.util.Scanner;

public class Newpattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int r=in.nextInt();
        System.out.println("Enter no of cols:");
        int c=in.nextInt();
        int[][] arr=new int[r][c];

        System.out.println("The Pattern:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }

            }
            System.out.println();
        }
    }
}
