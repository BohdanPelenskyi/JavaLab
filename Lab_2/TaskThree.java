import java.util.Scanner;

public class TaskThree {
    public static void taskThree(Scanner scanner) {
        System.out.println("Task 3. Two-digit even number");

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99 && number % 2 == 0) {
            System.out.println("The number is two-digit and even.");
        } else {
            System.out.println("The number does not satisfy the condition.");
        }
    }
}