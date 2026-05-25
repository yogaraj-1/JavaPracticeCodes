package ArrayPractice;

import java.util.ArrayList;

public class ArrayExcercise8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,5,6};
        int[] arr2={1,2,2,5,5,6,7,7};
        ArrayList<Integer> ans = IntersectionArray(arr1,arr2);
        System.out.println(ans);
    }
    public static ArrayList<Integer> IntersectionArray(int[] arr1, int[] arr2){
        ArrayList<Integer> arr=new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) != arr1[i]){//this condition is to include only unique elements if yo dont need you can remove it
                    arr.add(arr1[i]);
                }
             i++;
             j++;
            } else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return arr;
    }
}
