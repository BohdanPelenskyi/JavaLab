import java.util.Scanner;

public class TaskTwo {
    public static void taskTwo(Scanner scanner) {
        System.out.println("Task 2. Coordinate quarter");

        System.out.print("x = ");
        double x = scanner.nextDouble();

        System.out.print("y = ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("The point is in the 1st quarter.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the 2nd quarter.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the 3rd quarter.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the 4th quarter.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point is at the origin.");
        } else if (x == 0) {
            System.out.println("The point is on the Y axis.");
        } else {
            System.out.println("The point is on the X axis.");
        }
    }
}