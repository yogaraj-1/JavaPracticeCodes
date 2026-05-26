/*Stock Buy And Sell
Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit,
return 0.
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
package ArraySheetPractise;

import java.util.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int ans = findMaxProfit(arr);
        System.out.println(ans);
    }

    public static int findMaxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minPrice) minPrice = arr[i];
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }
        return maxProfit;
    }
}
