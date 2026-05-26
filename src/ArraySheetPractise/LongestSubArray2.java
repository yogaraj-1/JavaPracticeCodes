/*
Length of the longest subarray with zero Sum
Input:
 K = 3, array[] = {1, 2, 1, 1, 1}
Result:
 3

 if the array consists positive and negative numbers then we can go with hashing method
 */
package ArraySheetPractise;

public class LongestSubArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1};
        int k = 3;
        int ans = findLongestSubArray(arr, k);
        System.out.println(ans);
    }

    public static int findLongestSubArray(int[] arr, int k) {
        int max = 0;
        int left = 0, right = 0;
        int sum = arr[0];
        int n = arr.length;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                max = Math.max(max, right - left + 1);
            }
            right++;
            if (right < n) sum += arr[right];
        }
        return max;
    }

}

