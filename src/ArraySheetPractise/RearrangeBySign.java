/*
Rearrange Array Elements by Sign
Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
 Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

 as it give to maintain the relative order we cant do this inplace so we should use a DS to store the answer
Input:
arr[] = {1,2,-3,-1,-2,3}, N = 6
Output:
1 -3 2 -1 3 -2

 */
package ArraySheetPractise;

import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -1, -2, 3};
        int n = arr.length;
        int[] ans = new int[n];
        ans = findIndexRangeOfMaxSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findIndexRangeOfMaxSum(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for (int el : arr) {
            if (el > 0) {
                ans[pos] = el;
                pos += 2;
            } else {
                ans[neg] = el;
                neg += 2;
            }
        }
        return ans;
    }
}
