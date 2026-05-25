package ArrayPractice;
//leetcode problem 485
import java.util.Arrays;
import java.util.Map;

public class ArrayExcercise10 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 7, 7,1,1,1,1};
        int count = maxConsecutiveOnes(arr);
        System.out.println(count);
    }

    public static int maxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int c = 0;
        int cmax = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                c++;
            } else {
                cmax = Math.max(c, cmax);
                c = 0;
            }
        }
        cmax = Math.max(c, cmax);//because we are using else block only when the condition fails else block executed and cmax value will be updated otherwise c only stores the max value lastly we are comparing it with cmax
        return cmax;
    }
}
