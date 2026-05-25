package practice;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        MethodExample obj=new MethodExample();

        //obj.Display();

        //System.out.println(obj.square(a));
       // System.out.println("Enter two numbers:");
        //int b= sca.nextInt();
        //int c= sca.nextInt();
       // System.out.println("The Power is:"+power(b,c));
        //System.out.println("The sum is "+add(b,c));
        System.out.println("Enter a numbers: ");
       // int a=sca.nextInt();
        //System.out.println("Enter power Number:");
        //int b=sca.nextInt();
       // System.out.println("The Number is "+Even(a));

        System.out.println("The Sum is:"+add(1,3));

        System.out.println("The Sum is:"+add(0.9,0.9));
    }
    static void Display(){
        System.out.println("\"Hello!, World\"");
    }
    static int square(int a){
        return a*a;
    }
    static int Power(int a,int b){
        int val=1;
       if(a>0&&b>0){
        for(int i=0;i<b;i++){
            val*=a;
        }}
        return val;
    }
    static int add(int b,int c){
        return b+c;
    }
    static double add(double b,double c){
        return b+c;
    }
    static String Even(int b){
        String str="";
        if(b % 2 == 0){
            str="Even";
        }
        else{
            str="Odd";
        }
        return str;
    }
    static void Swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A ="+a);
        System.out.println("B ="+b);
    }

}
