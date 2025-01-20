public class NaturalNumReverse {
    public static void main(String[] args) {
        //Write a program to print all natural numbers in reverse.
        int num = 12345;
        int reverse = 0;
        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + reverse);
    }
}
