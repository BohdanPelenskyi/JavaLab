import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter task number (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                TaskOne.execute();
                break;

            case 2:
                TaskTwo.execute();
                break;

            case 3:
                TaskThree.execute();
                break;

            case 4:
                TaskFour.execute();
                break;

            default:
                System.out.println("Invalid task number.");
        }

        scanner.close();
    }
}