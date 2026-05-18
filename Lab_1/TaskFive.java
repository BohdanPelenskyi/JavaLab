import java.util.Scanner;

public class TaskFive {
    public static void taskFive(Scanner scanner) {
        int number;

        while (true) {
            System.out.print("\nEnter a three-digit number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error! You must enter a number.");
                scanner.next();
                continue;
            }

            number = scanner.nextInt();

            if (number < 100 || number > 999) {
                System.out.println("The number must be three digits.");
                continue;
            }

            break;
        }

        int lastDigit = number % 10;
        int middleDigit = (number / 10) % 10;
        int firstDigit = number / 100;

        int reversedNumber = lastDigit * 100 + middleDigit * 10 + firstDigit;

        System.out.println("Entered number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}