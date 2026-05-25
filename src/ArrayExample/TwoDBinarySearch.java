package ArrayExample;

import java.util.Arrays;

public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] arr={{2,5,8,10},
                {12,25,27,28},
                {34,36,38,39},
                {46,56,78,89}};
        int target=90;
        int[] res=search(arr,target);
        if(res!=null){
        System.out.println("Element is found at the index "+ Arrays.toString(res));
        }
        else{
            System.out.println("Not found");
        }
    }
    public static int[] search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        int start=0;
        int end=row*col-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int r=mid/col;
            int c=mid%col;
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return null;
    }
}
