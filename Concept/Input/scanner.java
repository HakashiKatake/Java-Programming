import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Your name is "+name);
        in.close();
    }
}
