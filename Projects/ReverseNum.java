import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        //Write a program to reverse the digits of a given integer number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + reverse);
        sc.close();
    }
}
