package ArrayExample;

import java.util.Arrays;

public class TwoDStaircaseSearching {
    public static void main(String[] args) {

    int[][] arr = {{1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}};
    int target = 9;
    int[] res = search(arr, target);
    if(res!=null){
        System.out.println("Element is found at the index " + Arrays.toString(res));
    }else
    {
        System.out.println("Not found");
    }
}
public static int[] search(int[][] arr,int target) {
        int row=arr.length;
        int col=arr[0].length;
        int r=0;
        int c=col-1;
        while(r<row && c>=0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            } else if (target < arr[r][c]) {
                c--;
            } else {
                r++;
            }

        }
            return null;
    }
}
