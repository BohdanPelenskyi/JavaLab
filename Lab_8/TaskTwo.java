import java.io.FileReader;
import java.io.IOException;

public class TaskTwo {
    public static void readFile(String fileName) {
        System.out.println("\nReading saved file");

        try {
            FileReader reader = new FileReader(fileName);

            int character;

            System.out.print("File content: ");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

            System.out.println("\nReading completed.");

        } catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
        }
    }
}