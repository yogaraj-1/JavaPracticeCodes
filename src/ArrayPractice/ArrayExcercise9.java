package ArrayPractice;
//leetcode problem 268
import java.util.Arrays;

public class ArrayExcercise9 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,8};
        int MN =MissingNumber(arr);
        System.out.println(MN);
    }
    public static int MissingNumber(int[] arr){
        int sum=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int actualSum=(n*(n+1))/2;
        return actualSum-sum;
    }
}