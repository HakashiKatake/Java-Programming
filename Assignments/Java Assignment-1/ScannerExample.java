import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Taking integer input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered the integer: " + intValue);
        
        // Taking double input
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered the double: " + doubleValue);
        
        // Taking string input (one word)
        System.out.print("Enter a single word: ");
        String word = scanner.next();
        System.out.println("You entered the word: " + word);
        
        // Consume the newline left by next()
        scanner.nextLine();
        
        // Taking full line input
        System.out.print("Enter a full sentence: ");
        String line = scanner.nextLine();
        System.out.println("You entered the sentence: " + line);
        
        // Taking boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("You entered the boolean: " + boolValue);
        
        scanner.close();
    }
}