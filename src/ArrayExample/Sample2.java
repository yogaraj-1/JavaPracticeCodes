package ArrayExample;

import java.util.Arrays;

public class Sample2 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int[] arr2={50,60,70,80};
        int a1=arr1.length;
        int a2=arr2.length;
        int[] arr3=new int[(a1+a2)];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println("Array: "+Arrays.toString(arr3));
    }
}
