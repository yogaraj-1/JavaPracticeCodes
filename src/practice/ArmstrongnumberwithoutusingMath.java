package practice;
import java.util.Scanner;
public class ArmstrongnumberwithoutusingMath{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = in.nextInt();
            int original= num;


            int count = 0;
            int temp = num;
            while (temp > 0) {
                temp /= 10;
                count++;
            }


            int sum = 0;
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;


                int power = 1;
                for (int i = 0; i < count; i++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }


            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is NOT an Armstrong number.");
            }
            in.close();
        }
    }


