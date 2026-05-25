package Oops;

public class Books {
    Books(){
        System.out.println("Books created");
    }
    Books(int a,int b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        Books obj=new Books();
        Books obj1=new Books(5,5);
    }
}
