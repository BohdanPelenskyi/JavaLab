import java.util.Scanner;

public class TaskThree {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size n: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}