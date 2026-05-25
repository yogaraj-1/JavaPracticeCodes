package OopsConcept.Example1;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student obj=new Student();
        System.out.println("Rno:"+obj.rno+" "+"Name:"+obj.name+" "+"Mark:"+obj.marks);
        Student obj1=new Student(23,"yoga",67.0f);
        System.out.println("Rno:"+obj1.rno+" "+"Name:"+obj1.name+" "+"Mark:"+obj1.marks);
        Student obj2=new Student(obj);
        System.out.println("Rno:"+obj2.rno+" "+"Name:"+obj2.name+" "+"Mark:"+obj2.marks);

    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student(){
        this.rno=13;
        this.name="Raja";
        this.marks=90.9f;
    }
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    Student (Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

}

