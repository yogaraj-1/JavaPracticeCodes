/*
Leaders in an Array
It means : in an array the element which is greater than all the elements to its right is called leader.
Input:
 arr = [4, 7, 1, 0]
Output:
 7 1 0
Explanation:
 The rightmost element (0) is always a leader.
7 and 1 are greater than the elements to their right, making them leaders as well.
*/

package ArraySheetPractise;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> ls = findLeaders(arr);
        System.out.println(ls);
    }

    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[n - 1]);
        int max = arr[n - 1];
        for (int i = n - 2; i > 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
