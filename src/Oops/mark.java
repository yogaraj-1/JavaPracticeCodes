package Oops;


import java.util.Scanner;


    class stud{
        stud(){
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            int rno=sc.nextInt();
            display(name,rno);
        }
        void display(String name,int rno){
            System.out.println("name: "+name);
            System.out.println("roll no: "+rno);
        }
    }
    public class mark extends stud{
        mark(){
            Scanner sc=new Scanner(System.in);
            int mark1=sc.nextInt();
            int mark2=sc.nextInt();
            int mark3=sc.nextInt();
            cal(mark1,mark2,mark3);
        }
        void cal(int mark1,int mark2,int mark3){
            int total=mark1+mark2+mark3;
            System.out.println("total marks: "+total);
        }
        public static void main(String[] args) {
            mark m=new mark();
        }
    }

