package Oops;

public class Car {
    String model;
    double price;
    Car(String model,double price){
        this.model=model;
        this.price=price;
    }
    public  void display(){
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
    }
    public void apply(int dis){
        System.out.println("Model:"+model);
        System.out.println("Price:"+(price-(price*dis/100)));
    }
    public static void main(String[] args) {
        Car obj=new Car("BMW G",1000000);
        obj.display();
        obj.apply(25);
    }
}
