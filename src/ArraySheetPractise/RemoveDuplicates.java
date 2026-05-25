/*Remove Duplicates in-place from Sorted Array
Input: arr[]=[1,1,2,2,2,3,3]
Output: [1,2,3,_,_,_,_]  */
package ArraySheetPractise;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr={1,1,2,2,2,2,3,3,3,4,4,4,5,5,6,6,7,8,9};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void removeDuplicates(int[] arr) {
     int candidate=arr[0];
     int n=arr.length;
     int c=1;
     for(int i=1;i<n;i++){
         if(arr[i]!=candidate) {
             arr[c++] = arr[i];
             candidate=arr[i];
         }
         }
     }
    }

