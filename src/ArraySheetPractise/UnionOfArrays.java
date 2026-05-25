/*
Union of Two Sorted Arrays
Input:n = 5,m = 5 arr1[] = {1,2,3,4,5}  arr2[] = {2,3,4,4,5}
Output: {1,2,3,4,5}
 */
package ArraySheetPractise;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class UnionOfArrays {
    public static void main(String[] args){
        int m=8,n=6;
        int[] arr1={1,2,3,4,5,6,7,9};
        int[] arr2= {2,3,4,4,5,10};
        List<Integer> ans=Union(m,n,arr1,arr2);
        System.out.println(ans);
    }
    public static List<Integer> Union(int m,int n,int[] arr1,int[] arr2){
        int i=0,j=0;
        List<Integer> ls=new ArrayList<>();
        while(i<m && j<n) {
            if(i>0 && arr1[i]==arr1[i-1]){ i++; continue;}
            if(j>0 && arr2[j]==arr2[j-1]){j++;continue;}
            if (arr1[i] < arr2[j]) {
                ls.add(arr1[i]);
                i++;
            } else if (arr2[j]<arr1[i]) {
                ls.add(arr2[j]);
                j++;
            }
            else {
                ls.add(arr1[i]);
                i++;
                j++;
            }
        }
        while( i<m ){
           if(i>0 && arr1[i]!=arr1[i-1]) {ls.add(arr1[i]); i++;}
        }

        while(j<n){
            if(j>0 && arr2[j]!=arr2[j-1]) {ls.add(arr2[j]); j++;}
        }
        return ls;
    }
}
