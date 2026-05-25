package practice;

import java.util.concurrent.Callable;

public class CalculatorSample {
    int a,b,c,d;
    CalculatorSample(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    void add(){
        System.out.println(a+b+c+d);
    }
    void sub(){
        System.out.println(a-b-c-d);
    }

    public static void main(String[] args) {
     CalculatorSample obj=new CalculatorSample(12,3,4,4);
     obj.add();
     obj.sub();

    }
}
