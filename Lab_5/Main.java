import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Laboratory work 5");
        System.out.println("Building methods in Java");
        System.out.println("1 - Area of a right triangle");
        System.out.println("2 - Minimum of three numbers");
        System.out.println("3 - Print array");
        System.out.println("4 - Maximum number from array");
        System.out.print("\nEnter task number: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                TaskOne.taskOne();
                break;

            case 2:
                TaskTwo.taskTwo();
                break;

            case 3:
                TaskThree.taskThree();
                break;

            case 4:
                TaskFour.taskFour();
                break;

            default:
                System.out.println("Invalid task number.");
        }

        scanner.close();
    }
}
