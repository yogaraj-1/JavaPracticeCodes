package Oops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    Bank(String name){
        System.out.println("Welcome "+name);
    }
    public static void main(String[] args) {
        String name ="Raja";
        int balance=1000;
        Scanner in=new Scanner(System.in);
        System.out.println("Please Insert Your card");
        System.out.println("Please Enter Pin:");
        int pin=in.nextInt();
        Bank obj=new Bank(name);
        System.out.println("Enter Options.");
        System.out.println("1.Add Cash.");
        System.out.println("2.Withdraw cash.");
        System.out.println("3.Balance.");
        int op=in.nextInt();
        switch(op){
            case 1:
                System.out.println("Enter Amount to Add");
                int add=in.nextInt();
                balance=balance+add;
                System.out.println("Successfully Added");
                System.out.println("Balance: "+balance);
                break;
            case 2:
                System.out.println("Enter Amount to Withdraw:");
                int with=in.nextInt();
                balance=balance-with;
                System.out.println("Successfully Withdrawn");
                System.out.println("Balance: "+balance);
                break;
            case 3:
                System.out.println("Your Balance: "+balance);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
