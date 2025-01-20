import java.util.Scanner;
import java.lang.Math;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num /= 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}
