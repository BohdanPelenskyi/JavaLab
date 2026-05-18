import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TaskOne {
    public static void writeRandomNumbers(String fileName, int b1, int b2) {
        int count = 15;
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                boolean created = file.createNewFile();

                if (created) {
                    System.out.println("\nFile '" + fileName + "' was not found. New file created.");
                }
            } else {
                System.out.println("\nFile '" + fileName + "' already exists. Data will be overwritten.");
            }

            FileWriter writer = new FileWriter(file);
            Random random = new Random();

            System.out.println("Generating " + count + " random numbers in range ["
                    + b1 + "; " + b2 + "]...");

            for (int i = 0; i < count; i++) {
                int number = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("Writing to file completed successfully.");

        } catch (IOException e) {
            System.out.println("File writing error: " + e.getMessage());
        }
    }
}