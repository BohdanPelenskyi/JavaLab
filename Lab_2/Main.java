import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Laboratory work 2");
        System.out.println("1 - Quadratic equation");
        System.out.println("2 - Coordinate quarter");
        System.out.println("3 - Two-digit even number");
        System.out.println("4 - Piecewise function");
        System.out.print("\nEnter task number: ");

        int task = scanner.nextInt();

        switch (task) {
            case 1:
                TaskOne.taskOne(scanner);
                break;

            case 2:
                TaskTwo.taskTwo(scanner);
                break;

            case 3:
                TaskThree.taskThree(scanner);
                break;

            case 4:
                TaskFour.taskFour(scanner);
                break;

            default:
                System.out.println("Invalid task number.");
        }

        scanner.close();
    }
}