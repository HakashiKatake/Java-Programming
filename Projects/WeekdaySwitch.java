import java.util.Scanner;

public class WeekdaySwitch {
    public static void main(String[] args) {
        //Write a program to read a weekday number and print weekday name using switch statement.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a weekday number: ");
        int weekday = sc.nextInt();

        switch(weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid weekday number");
        }

        
    }
}
