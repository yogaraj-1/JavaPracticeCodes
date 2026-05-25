package sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort1 {
    public static void main(String[] args){
        int[] arr={3,1,2,4,1,5,2,6,4};
        sortArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortArray(int[] nums,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            sortArray(nums,low,mid);
            sortArray(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    public static void merge(int[] nums,int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }else{
                temp.add(nums[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(nums[i]);
            i++;
        }
        while(j<=high){
            temp.add(nums[j]);
            j++;
        }
        for(int a=0;a<temp.size();a++){
            nums[low+a]=temp.get(a);
        }
    }
}
