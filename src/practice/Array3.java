package practice;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char[] arr=new char[n];
        char a=97;
        for(int i=0;i<n;i++){
            if(i==1||i==2||i==5){
                arr[i]=32;
            }
            else{
                arr[i]=a++;
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(c%3==0){
                System.out.println();
            }
            System.out.print(arr[i]+" ");
            c++;
        }
    }
}