package OopsConcept.Example1;

public class StaticInitializationDemo {
    static int a=5;
    static int b;
    //will only run once ,when the first object is created i.e. when the class is loaded for the first time
    static{
        System.out.println("I am a static block");
        b=a*4;
    }

    public static void main(String[] args) {
        StaticInitializationDemo obj=new StaticInitializationDemo();
        System.out.println(obj.a +" "+obj.b);
        obj.b+=3;
        System.out.println(obj.a +" "+obj.b);
        StaticInitializationDemo ob1=new StaticInitializationDemo();
        System.out.println(obj.a +" "+obj.b);
    }
}
