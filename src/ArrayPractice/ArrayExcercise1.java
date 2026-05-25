package ArrayPractice;

public class ArrayExcercise1 {
        public static void main(String[] args) {
            int[] arr={1,2,3,4,0,5,6,7,8};
            int second =SecondLargest(arr);

            System.out.println(second);
        }
        
        public static int SecondLargest(int[] arr){
            int max=arr[0];
            int sec=Integer.MIN_VALUE;
            int n=arr.length;
            for(int i=1;i<n;i++){
                if(arr[i]>max){
                    sec=max;
                    max=arr[i];

                }
            }
            return sec;
        }
}
