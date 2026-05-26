/*Kadane's Algorithm : Maximum Subarray Sum in an Array
Example 1:
Input:
 nums = [2, 3, 5, -2, 7, -4]
Output:
 15
 */
package ArraySheetPractise;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        long ans = findMaximumSubArray(arr);
        System.out.println(ans);
    }

    public static long findMaximumSubArray(int[] arr) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) maxi = sum;
            if (sum < 0) sum = 0;
        }
        return maxi;
    }
}
