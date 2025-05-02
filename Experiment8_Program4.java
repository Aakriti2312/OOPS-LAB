import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Experiment8_Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = input.nextLine();
        
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            
            int wordCount = 0;
            int charCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+"); // Splitting by spaces
                wordCount += words.length;
                charCount += line.replaceAll("\\s", "").length(); // Remove whitespace for char count
            }

            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        input.close();
    }
}
