package sorting;

public class kthLargestElement {
    public static void main(String[] args){
        int[] arr={3,1,2,4,5,6,4};
        int k=4;
        int ans=findKthLargestElement(arr,0,arr.length-1, arr.length-k);
        System.out.println(ans);
    }
    public static int findKthLargestElement(int[] nums,int low,int high,int k) {
        if(low<=high){
            int pivot=findPivotPosition(nums,low,high);
            if(pivot==k) return nums[pivot];
            else if(pivot>k) return findKthLargestElement(nums,low,pivot-1,k);
            else  return findKthLargestElement(nums,pivot+1,high,k);
        }
        return -1;
    }
    public static int findPivotPosition(int[] nums,int low,int high){
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && nums[i]<=pivot){
                i++;
            }
            while(j>low && nums[j]>pivot){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,j,low);
        return j;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
