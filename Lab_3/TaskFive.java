import java.util.Scanner;

public class TaskFive {
    public static void taskFive() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound of the range: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the upper bound of the range: ");
        double b = scanner.nextDouble();

        int count = 0;

        System.out.println("\nFunction table (for loop):");


        for (double x = -2.0; x <= 2.01; x += 0.2) {

            double f = 3 * Math.sin(Math.sqrt(3)) + 0.35 * x - 3.8;

            System.out.printf("x = %5.2f   f(x) = %.4f%n", x, f);

            if (f >= a && f <= b) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Number of values in the range: " + count);
        } else {
            System.out.println("No function values in the specified range.");
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Function table (while loop):");

        double x = -2.0;
        count = 0;

        while (x <= 2.01) {

            double f = 3 * Math.sin(Math.sqrt(3)) + 0.35 * x - 3.8;

            System.out.printf("x = %5.2f   f(x) = %.4f%n", x, f);

            if (f >= a && f <= b) {
                count++;
            }

            x += 0.2;
        }

        if (count > 0) {
            System.out.println("Number of values in the range: " + count);
        } else {
            System.out.println("No function values in the specified range.");
        }
    }
}