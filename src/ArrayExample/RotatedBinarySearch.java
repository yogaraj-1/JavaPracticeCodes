package ArrayExample;

public class RotatedBinarySearch {
    public static void main(String[] args){
    int[] arr={12,23,45,66,35,77};
    int target=77;
    int ans=Search(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    public static int Search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(target==arr[m]){
            return m;
        }
        if(arr[s]<=arr[m]){
        if(target>=arr[s] && target <=arr[m]){
            return Search(arr,target,s,m-1);
        }else{
            return Search(arr,target,m+1,e);
        }
        }
        if(target>=arr[m]&&target<=arr[e]){
            return Search(arr,target,m+1,e);
        }else {
            return Search(arr, target, s, m-1);
        }

    }
}
