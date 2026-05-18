import java.util.Scanner;

public class TaskOne {
    public static void taskOne(Scanner scanner) {
        System.out.println("Task 1. Quadratic equation");

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Error: a cannot be 0 in a quadratic equation.");
            return;
        }

        double d = b * b - 4 * a * c;

        System.out.println("Discriminant D = " + d);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);

            System.out.println("x = " + x);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}