/*
Length of the longest subarray with zero Sum
Input:
 K = 3, array[] = {1, -1, 5, -2, 3}
Result:
 4

 if the array consists positive and negative numbers then we can go with hashing method
 */
package ArraySheetPractise;

import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        int ans = findLongestSubArray(arr, k);
        System.out.println(ans);
    }

    public static int findLongestSubArray(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int maxLength = 0, sum = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (mp.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - mp.get(sum - k));
            }
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        return maxLength;
    }
}
