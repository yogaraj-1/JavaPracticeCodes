package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime Number.");
        } else {
            System.out.println("Not a Prime NUmber.");
        }
    }

        static boolean isPrime(int n) {
           /* if (n <= 1) {
            return false;
            }
            int c=2;
            while (c*c<=n) {
                if(n%c==0){
                    return false;
                }
                c++;
            }
        return c*c>n;*/
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }


}
