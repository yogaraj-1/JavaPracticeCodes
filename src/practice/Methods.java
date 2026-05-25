package practice;

import java.util.Scanner;

public class Methods {
    public static int add(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };


        Methods obj=new Methods();
        System.out.println(obj.add(arr));
    }
}
