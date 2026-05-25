package ArrayExample;

import java.util.Scanner;

public class SumInArray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int r=in.nextInt();
        System.out.println("Enter no of cols:");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the Nums:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("the sum is "+Sum(arr));
    }
    public static int Sum(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
