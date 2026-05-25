package Oops;

 class Vehicle {

    Vehicle(String brand,double speed) {
        System.out.println("Brand:"+brand);
        System.out.println("Speed:"+speed);
    }
}
class CarE extends Vehicle{
    CarE(String model){
        super("BMW",240);
      display(model);
    }
    void display(String mode){
        System.out.println("Model:"+mode);

    }

    public static void main(String[] args) {
    CarE obj=new CarE("BS6");
    }
        }

