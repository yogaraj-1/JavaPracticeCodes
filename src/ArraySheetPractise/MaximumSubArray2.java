/*
Kadane's Algorithm : Maximum Subarray Sum in an Array
to print the range
example
input: [-2,1,-3,4,-1,2,1,-5,4]
{max sum is 6}
output:[3,6]
 */
package ArraySheetPractise;

import java.util.Arrays;

public class MaximumSubArray2 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] ans = new int[2];
        ans = findIndexRangeOfMaxSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findIndexRangeOfMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int n = arr.length;
        int start = 0, end = 0, tempStart = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        return new int[]{start, end};
    }
}
