
import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        int month;
        String season;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month");
        month = in.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        } else {
            season = "Invalid month";
        }

        System.out.println("The season is " + season);
    }
}