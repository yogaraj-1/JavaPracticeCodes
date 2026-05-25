package ArrayExample;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0,5};
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverseArray(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
        return arr;
    }
    public static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
}
