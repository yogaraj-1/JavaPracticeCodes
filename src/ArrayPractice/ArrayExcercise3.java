package ArrayPractice;

import java.util.Arrays;

//leetcode problem 26
public class ArrayExcercise3 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,7,7};
        int count=RemoveDuplicates(arr);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
    public static int RemoveDuplicates(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

}
