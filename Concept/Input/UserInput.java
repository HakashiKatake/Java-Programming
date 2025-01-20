import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int num = in.nextInt();
        System.out.println("You entered "+num);

        System.out.println("Enter a floating point number");
        float num2 = in.nextFloat();
        System.out.println("You entered "+num2);

        System.out.println("Enter an double number");
        double num3 = in.nextDouble();
        System.out.println("You entered "+num3);

        System.out.println("Enter a string");
        String str = in.next();
        System.out.println("You entered "+str);

        System.err.println("Enter a character");
        char ch = in.next().charAt(0);
        System.out.println("You entered "+ch);


        in.close();

    }
}
