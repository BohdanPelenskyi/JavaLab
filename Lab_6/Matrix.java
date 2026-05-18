import java.util.Scanner;

public class Matrix {
    protected double[][] matrix;

    public Matrix() {
        matrix = new double[3][3];
    }

    public void inputMatrix(Scanner scanner) {
        System.out.println("Enter elements of matrix B (3x3):");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    public void printMatrix() {
        System.out.println("Matrix B:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public double getMatrixNorm() {
        double maxColumnSum = 0;

        for (int j = 0; j < 3; j++) {
            double columnSum = 0;

            for (int i = 0; i < 3; i++) {
                columnSum += matrix[i][j];
            }

            if (columnSum > maxColumnSum) {
                maxColumnSum = columnSum;
            }
        }

        return maxColumnSum;
    }
}