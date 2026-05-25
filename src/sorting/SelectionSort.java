package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,23,12,34,-8,-78,25,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n= arr.length;
       for(int i=0;i<n-1;i++){
           int min=i;
           for(int j=i;j<n;j++){
               if(arr[j]<arr[min]) min=j;
           }
           swap(arr,min,i);
       }
    }
    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
