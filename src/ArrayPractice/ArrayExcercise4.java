package ArrayPractice;

import java.util.Arrays;

public class ArrayExcercise4 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,7,7};
        LeftRotateArray(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void LeftRotateArray(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
}
