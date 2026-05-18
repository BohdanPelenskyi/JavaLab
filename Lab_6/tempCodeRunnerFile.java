import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Laboratory work 6");
        System.out.println("Working with classes in Java");
        System.out.println("1 - Person class");
        System.out.println("2 - Phone class");
        System.out.println("3 - Shape hierarchy");
        System.out.println("4 - Abstract Car class");
        System.out.println("5 - Individual task 5.13 Matrix");
        System.out.println("6 - ExtendedProduct child class");
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

            case 5:
                TaskFive.taskFive(scanner);
                break;

            case 6:
                TaskSix.taskSix();
                break;

            default:
                System.out.println("Invalid task number.");
        }

        scanner.close();
    }
}