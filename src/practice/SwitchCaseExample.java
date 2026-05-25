package practice;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int num1 = in.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = in.nextInt();
        System.out.println("Enter operation");
        int num = in.nextInt();

        switch (num) {
            case 1:
                System.out.println("Addition: "+(num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division: " + (num1 / num2));
                break;
            case 5:
                System.out.println("Modulus: " + (num1 % num2));
                break;
            default:
                System.out.println("Enter valid operation");
 /*       switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid Number.");*/
                //new syntax of Switch statement
        /*switch(num1){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default ->System.out.println("Enter a valid number.");
        }*/
        /*switch(num2){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7-> System.out.println("WeekEnd");
            default -> System.out.println("Enter a valid number.");*/

        }
    }
}
