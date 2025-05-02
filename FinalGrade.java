import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int marks3 = scanner.nextInt();

        int average = (marks1 + marks2 + marks3) / 3;

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 75) {
            System.out.println("Grade B");
        } else if (average >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }


        scanner.close();
    }
}
