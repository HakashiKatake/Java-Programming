import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        //Write a program to find sum of digits of a number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of the digits is: " + sum);
        sc.close();
    }
}
