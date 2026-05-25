package ArrayPractice;
//union of two sorted arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExcercise7 {
    public static void main(String[] args) {
        int[] arr1 = {0,1, 1, 2, 3, 7, 7,90,90,90,97};
        int[] arr2={2,2,5,5,6,7};
        ArrayList<Integer> ans = UnionArray(arr1,arr2);
        System.out.println(ans);
    }
    public static ArrayList<Integer> UnionArray(int[] arr1, int[] arr2){
        ArrayList<Integer> arr=new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1)!=arr1[i]){
                    arr.add(arr1[i]);
                }
                i++;
            }else{
                if(arr.isEmpty() || arr.get(arr.size()-1)!=arr2[j]){
                    arr.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]) {
                arr.add(arr1[i]);
            }
            i++;
        }
                while(j<n2) {
                    if (arr.isEmpty() || arr.get(arr.size() - 1) != arr2[j]) {
                        arr.add(arr2[j]);
                    }
                    j++;
                }
                return arr;
    }
}
