import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        char grade;

        switch ((score > 90) ? 1 : (score >= 80) ? 2 : (score >= 70) ? 3 : (score >= 60) ? 4 : (score >= 50) ? 5 : 6) {
            case 1:
                grade = 'A';
                break;
            case 2:
                grade = 'B';
                break;
            case 3:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
        }

        System.out.println("The student's grade is: " + grade);
    }
}