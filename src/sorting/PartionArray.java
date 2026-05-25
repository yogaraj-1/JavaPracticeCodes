//Move the smallest elements to left and largest elements to the right;
package sorting;

import java.util.Arrays;

public class PartionArray {
    public static void main(String[] args){
        int[] arr={3,1,2,4,1,5,2,6,8,0};
        Part(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void Part(int[] arr,int pivot){
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while(mid<=high) {
            if (arr[mid]<pivot) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid]==pivot) {
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
        }
        }
    }
}
