
import java.util.Scanner;


public class switchcase {
    public static void main(String[] args) {
        int month;
        String season;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month");
        month = in.nextInt();
        
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println("The season is " + season);
    }
    
    
}
