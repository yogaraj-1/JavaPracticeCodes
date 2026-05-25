package practice;
import java.util.Scanner;
public class pr1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      //System.out.println("Enter Number:");
       /* int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater.");
        }
        else if(b>c){
            System.out.println(b+" is greater.");

        }
        else{
            System.out.println(c+" is greater.");
        }*/

        /*if(num<40){
            System.out.println("Fail");
        }
        else if(num>=40 && num<60){
            System.out.println("Pass");
        }
        else if(num>=60 && num<80){
            System.out.println("Average");
        }
        else{
            System.out.println("Best");
        }*/
        //int a='A';
        //System.out.println((int)('A'));

        System.out.println("Enter a year:");
                int year = in.nextInt();

                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        }
