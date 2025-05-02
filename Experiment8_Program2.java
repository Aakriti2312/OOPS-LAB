import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Experiment8_Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = input.nextInt();

        System.out.print("Enter Grade: ");
        String grade = input.next();

        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student details written to file.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        }

        input.close();
    }
}
