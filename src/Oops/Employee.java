package Oops;

import java.util.Scanner;

class Employee {
    Scanner in=new Scanner(System.in);
    int id;
    String name;
    Employee(){
    this.id=34;

    this.name="Raja";
    showEmployee();
    }
    void showEmployee(){
        System.out.println("Employee Details.");
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
    }
     class Developer extends Employee{
    //Scanner scan=new Scanner(System.in);
    Developer(String pl){

        display(pl);
    }
    void display(String pl){
        System.out.println("Programming Language: "+pl);
    }
    public static void main(String[] args){
        Developer obj=new Developer("python");
    }
    }

