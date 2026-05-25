package ArrayExample;

import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int r=in.nextInt();
        System.out.println("Enter no of cols:");
        int c=in.nextInt();
        String[][] arr=new String[r][c];
        System.out.println("Enter the Words:");
        in.nextLine();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextLine();
            }
        }
        System.out.println("The 2 D Array:");
        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
