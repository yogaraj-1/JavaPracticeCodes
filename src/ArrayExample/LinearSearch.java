package ArrayExample;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={9,1,8,7,5};
        int target=7;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return target;
            }
        }
        return -1;
    }
}
