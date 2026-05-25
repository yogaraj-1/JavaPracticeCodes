package practice;
import java.sql.SQLOutput;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=num){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.printf("The %dth fibonacci number is %d.\n",num,b);
    }
}
