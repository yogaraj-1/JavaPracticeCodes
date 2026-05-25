package sorting;

import java.util.Arrays;

public class QuickSort1 {
    public static void main(String[] args){
        int[] arr={3,1,2,4,1,5,2,6,4};
        sortArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortArray(int[] nums,int low,int high) {
        if(low<high){
            int pivot=findPivotPosition(nums,low,high);
            sortArray(nums,low,pivot-1);
            sortArray(nums,pivot+1,high);
        }
    }
    public static int findPivotPosition(int nums[],int low,int high){
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && nums[i]<=pivot){
                i++;
            }
            while(j>low && nums[j]>pivot){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,j,low);
        return j;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }
