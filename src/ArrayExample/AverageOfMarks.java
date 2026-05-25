package ArrayExample;

import java.util.Scanner;

public class AverageOfMarks extends Calculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n=in.nextInt();
        System.out.println("Enter the Marks:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Mark " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        AverageOfMarks obj =new AverageOfMarks();
        float avg = obj.Average(arr);
        String grade = obj.Grade(avg);
        System.out.println("Average Mark:" + avg);
        System.out.println("Grade: " + grade);

    }
}
    class Calculation {
    public static float Average(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        float avg=sum/arr.length;
        return avg;
    }
    public static String Grade(float avg){
        String grade;
        if(avg>=90){
            grade="A";
        }
        else if(avg <90 &&avg>=65){
            grade="B";
        }
        else if(avg<65 && avg>=50){
            grade="C";
        }
        else{
            grade="FAIL";
        }
        return grade;
    }
}
