/*Two Sum : Check if a pair with given sum exists in Array
Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
Output : [1,3]
If it is a sorted array we can use two pointer approach but if it not a sorted array then we can go with hashmap approach
 */

package ArraySheetPractise;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 19;
        int[] ans = new int[2];
        ans = findIndexOfTheSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findIndexOfTheSum(int[] arr, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int complement = Math.abs(target - arr[i]);
            if (mp.containsKey(complement)) return new int[]{mp.get(complement), i};
            else mp.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
