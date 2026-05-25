package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
       // int[] arr={1,2,3};
      //  List<List<Integer>> ans=Subset(arr);

        //duplicate Testing
        int[] arr={1,2,2};
        List<List<Integer>> ans=SubsetDup(arr);

        System.out.println(ans);
    }
    public static List<List<Integer>> Subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    //If duplucates comes then we need to use this code;
    public static List<List<Integer>> SubsetDup(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner=new ArrayList<>(outer.get(j ));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
