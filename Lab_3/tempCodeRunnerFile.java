import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter task number (1-5): ");
        
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
                TaskFive.taskFive();
                break;
            default:
                System.out.println("There is no such task!");
        }
        scanner.close();
    }
}