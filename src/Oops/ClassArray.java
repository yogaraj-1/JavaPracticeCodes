package Oops;
import java.util.Arrays;
import java.util.Scanner;
/*
class ClassArray extends ArrayDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n = in.nextInt();
        System.out.println("Enter the Nums:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        ClassArray obj = new ClassArray();
        obj.display(arr);

    }
}

class ArrayDisplay{
    static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
*/

class ClassArray extends ArrayDisplay {
    public static void main(String[] args) {
        ClassArray obj = new ClassArray();
    }
}
class ArrayDisplay{
    ArrayDisplay(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n = in.nextInt();
        System.out.println("Enter the Nums:");
        int[] arr = new int[n];
        for (int i=0; i<arr.length;i++) {
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}