package ArrayPractice;
//leetcode problem 189;
import java.util.Arrays;

public class ArrayExcercise5{
    public static void main(String[] args) {
        int[] arr={1,1,2,3,7,7};
        RightRotateArray(arr,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void RightRotateArray(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        k=n-k;
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