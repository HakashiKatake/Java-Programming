import java.util.Scanner;
public class GreatestUsingConditional {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();

        int result = 0;
        result = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Greatest number is: " + result);
        sc.close();
    }
}
