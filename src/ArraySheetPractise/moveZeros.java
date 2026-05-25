
/* Move all Zeros to the end of the array
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0 */

package ArraySheetPractise;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args){
        int[] arr={1,0,1,0,8,0,9,6,5,0,4};
        moveZerostoEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZerostoEnd(int[] arr) {
        int n = arr.length;
        int c=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[c++]=arr[i];
            }
        }
        while(c<n){
            arr[c]=0;
            c++;
        }
    }
}

