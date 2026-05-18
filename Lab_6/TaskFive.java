import java.util.Scanner;

public class TaskFive {
    public static void taskFive(Scanner scanner) {
        System.out.println("Task 5. Individual task. Matrix B 3x3");

        Matrix matrix = new Matrix();

        matrix.inputMatrix(scanner);

        System.out.println();
        matrix.printMatrix();

        double norm = matrix.getMatrixNorm();

        System.out.println("Matrix norm: " + norm);
    }
}