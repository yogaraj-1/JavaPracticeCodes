package OopsConcept.Example1;

public class SingleTonClass {
    //to make sure that only one instance can be created for this class ,we can make the constructor private
    private SingleTonClass(){

    }
    private static SingleTonClass instance;
    public static SingleTonClass getInstance(){
        //only one instance is created
        if(instance==null){
            instance=new SingleTonClass();
        }
        return instance;
    }
}
 class Main {
    public static void main(String[] args) {
        SingleTonClass obj=SingleTonClass.getInstance();
        SingleTonClass obj1=SingleTonClass.getInstance();
        SingleTonClass obj2=SingleTonClass.getInstance();

    }
}
