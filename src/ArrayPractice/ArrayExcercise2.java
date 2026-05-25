package ArrayPractice;
//leetcode problem 1752
//this code where is sorted evev if it is rotated
public class ArrayExcercise2 {
    public static void main(String[] args) {
        int[] arr={7,8,1,2,3,4,5,6};
        boolean ans=SortedOrNot(arr);

        System.out.println(ans);
    }
    public static boolean SortedOrNot(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){//to compare first and last element we are using %
                count++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
}
