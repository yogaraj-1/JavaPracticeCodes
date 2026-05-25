package OopsConcept.Example1;

public class finalizeDemo {
    public static void main(String[] args) {
        A obj;
        for( int i=0;i<1000000;i++){
            obj=new A("raja");
        }
    }
}
class A{
    String name;
    public A(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is Destroyed");
    }
}
