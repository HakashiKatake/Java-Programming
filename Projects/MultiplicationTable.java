import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Write a program to print multiplication table of a number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        sc.close();

    }
}
