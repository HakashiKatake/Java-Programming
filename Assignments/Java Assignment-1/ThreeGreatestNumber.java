import java.util.Scanner;
public class ThreeGreatestNumber {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        a = in.nextInt();
        System.out.println("Enter a number");
        b = in.nextInt();
        System.out.println("Enter a number");
        c = in.nextInt();
        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is " + b);
        } else {
            System.out.println("The greatest number is " + c);
        }
        in.close();
    }
}
