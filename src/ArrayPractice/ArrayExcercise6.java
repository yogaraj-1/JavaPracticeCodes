//leetcode problem 283

package ArrayPractice;

import java.util.Arrays;

public class ArrayExcercise6 {
    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,2,0,3,7,0};
        MoveZeroEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void MoveZeroEnd(int[] arr){
        int n= arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
