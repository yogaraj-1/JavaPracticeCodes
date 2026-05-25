/*Count Maximum Consecutive One's in the array
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
 */

package ArraySheetPractise;

public class consecutiveOnes {
    public static void main(String[] args){
        int[] arr={2,3,1,1,1,1,1,0,1,1,1};
        int ans=MaximumOnes(arr);
        System.out.println(ans);
    }
    public static int MaximumOnes(int[] arr){
        int maxCount=0;
        int currentCount=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                currentCount++;
                maxCount=Math.max(currentCount,maxCount);
            }else{
                currentCount=0;
            }
        }
        return maxCount;
    }
}
