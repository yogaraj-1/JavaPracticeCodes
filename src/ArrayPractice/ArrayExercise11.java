package ArrayPractice;
////leetcode problem 136
public class ArrayExercise11 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int count = FindTheSingleTimeNumber(arr);
        System.out.println(count);
    }
    public static int FindTheSingleTimeNumber(int[] arr){
        int res=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            res^=arr[i];
        }
        return res;
    }
}
