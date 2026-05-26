/*Find the Majority Element that occurs more than N/2 times
Input:
 nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
Output:
 7
 */

package ArraySheetPractise;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 7, 7};
        int ans = findMajorityElement(arr);
        System.out.println(ans);
    }

    public static int findMajorityElement(int[] arr) {
        int candidate = arr[0];
        int n = arr.length;
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) c++;
            else {
                c--;
                if (c == 0) {
                    candidate = arr[i];
                    c++;
                }

            }
        }
        int c1 = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == candidate) c1++;
        }
        if (c1 > n / 2) return candidate;
        return -1;
    }
}
