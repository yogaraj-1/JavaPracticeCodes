package sorting;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args){
        int[] arr={12,23,14,25,34,1,78,54};
        arr=sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sortArray(int[] nums) {
            int l=nums.length;
            if(l<=1){
                return nums;
            }
            int mid=l/2;
            int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
            int[] right=sortArray(Arrays.copyOfRange(nums,mid,l));
            return merge(left,right);
        }
        public static int[] merge(int[] left,int[] right){
            int[] mix=new int[left.length+right.length];
            int i=0,j=0,k=0;
            while(i<left.length && j<right.length){
                if(left[i]<right[j]){
                    mix[k]=left[i];
                    i++;
                }
                else{
                    mix[k]=right[j];
                    j++;
                }
                k++;
            }
            while(i<left.length){
                mix[k]=left[i];
                i++;
                k++;
            }
            while(j<right.length){
                mix[k]=right[j];
                j++;
                k++;
            }
            return mix;
        }
    }


