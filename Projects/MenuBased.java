
import java.util.Scanner;
public class MenuBased {
    public static void main(String[] args) {
        //Write a menu based Java program for performing different arithmetic operations
        

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if(choice == 5) {
                break;
            }
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Sum: " + (a + b));
                    break;
                case 2:
                    System.out.println("Difference: " + (a - b));
                    break;
                case 3:
                    System.out.println("Product: " + (a * b));
                    break;
                case 4:
                    System.out.println("Quotient: " + (a / b));
                    break;
                default:
                    System.out.println("Invalid choice!");
                sc.close();
            }
        }
    }
}
