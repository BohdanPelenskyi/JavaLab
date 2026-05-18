import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Laboratory work 1");
        System.out.println("1 - Operations with 10 integer variables");
        System.out.println("2 - Sentence from words");
        System.out.println("3 - User class");
        System.out.println("4 - Car class");
        System.out.println("5 - Reverse a three-digit number");
        System.out.print("\nEnter task number (1-5): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                TaskOne.calculateValues();
                break;

            case 2:
                TaskTwo.printSentence();
                break;

            case 3:
                TaskThree.taskThree();
                break;

            case 4:
                TaskFour.taskFour();
                break;

            case 5:
                TaskFive.taskFive(scanner);
                break;

            default:
                System.out.println("Invalid task number.");
        }

        scanner.close();
    }
}