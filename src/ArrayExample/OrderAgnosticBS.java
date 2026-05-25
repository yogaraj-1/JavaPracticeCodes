package ArrayExample;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={100,76,54,32,21,12,1,-67,-90};
        int target=-67;
        System.out.println(orderAgnosticBsearch(arr,target));
    }
    public static int orderAgnosticBsearch(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        boolean isAscend=arr[0]<arr[arr.length-1];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAscend){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
