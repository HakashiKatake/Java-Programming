import java.util.Scanner;
public class TwoGreater {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        a = in.nextInt();
        System.out.println("Enter a number");
        b = in.nextInt();

        if (a > b) {
            System.out.println("The greater number is " + a);
        } else {
            System.out.println("The greater number is " + b);
        }
        
        
    }
}
