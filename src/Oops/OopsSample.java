package Oops;

public class OopsSample extends cat {
    public static void main(String[] args) {
        OopsSample obj=new OopsSample();
        obj.meow();
        obj.bark();
    }
}
class cat extends dog{
  void meow(){
      System.out.println("Cat meow");
  }
}
class dog {
    void bark(){
        System.out.println("Dog barks");
    }
}
