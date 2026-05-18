import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Laboratory work 7");
        System.out.println("Working with collections in Java");
        System.out.println("1 - Taxi service");
        System.out.println("2 - Phone book");
        System.out.print("\nEnter task number: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                TaskOne.taskOne();
                break;

            case 2:
                TaskTwo.taskTwo();
                break;

            default:
                System.out.println("Invalid task number.");
        }

        scanner.close();
    }
}