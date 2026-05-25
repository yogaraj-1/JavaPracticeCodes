package ArrayExample;
import java.util.Scanner;
public class Array2 {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter no of rows:");
            int r=in.nextInt();
            System.out.println("Enter no of cols:");
            int c=in.nextInt();
            char[][] arr=new char[r][c];
            char ch='a';
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if((i==1 && j==0)||(i==1 &&j==2))
                    {
                        char a=32;
                        arr[i][j]=a;
                    }
                    else{
                        arr[i][j]=ch;
                        ch++;
                    }
                }
            }
            System.out.println("The 2 D Array:");
            for(int i=0;i<r;i++){

                for(int j=0;j<c;j++) {
                    System.out.print((arr[i][j])+" ");
                }
                System.out.println();
            }
        }
    }