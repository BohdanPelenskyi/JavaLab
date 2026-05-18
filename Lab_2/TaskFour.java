import java.util.Scanner;

public class TaskFour {
    public static void taskFour(Scanner scanner) {
        System.out.println("Task 4. Piecewise function, variant 13");

        System.out.print("x = ");
        double x = scanner.nextDouble();

        double f;

        if (x < -2) {
            // f(x) = sqrt(|ctg(x + 1)|)
            // ctg(x) = 1 / tg(x)
            f = Math.sqrt(Math.abs(1 / Math.tan(Math.abs(x + 1))));
        } else if (x >= -2 && x <= 2) {
            // f(x) = log2(|3 - cos(x)|)
            f = Math.log(Math.abs(3 - Math.cos(x))) / Math.log(2);
        } else {
            // f(x) = e^(2x - 3x^3)
            f = Math.exp(2 * x - 3 * Math.pow(x, 3));
        }

        System.out.println("f(x) = " + f);
    }
}