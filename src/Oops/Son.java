package Oops;

class Grandfather {
    void display2(){
        System.out.println("I am GrandFather.");
    }
}
class Father extends Grandfather {
    void display1(){
        System.out.println("I am Father.");
    }
}
public class Son extends Father {
    void display(){
        System.out.println("I am Son.");
    }

    public static void main(String[] args) {
        Son ob=new Son();
        ob.display();
        ob.display1();
        ob.display2();
    }
}

