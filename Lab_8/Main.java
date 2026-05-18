public class Main {
    public static void main(String[] args) {
        System.out.println("Laboratory work 8");
        System.out.println("Input/output streams. Working with files.");

        if (args.length != 3) {
            System.out.println("Error: you must enter 3 command line arguments.");
            System.out.println("Example:");
            System.out.println("java Main mynumbers.txt 1 100");
            return;
        }

        String fileName = args[0];

        int b1;
        int b2;

        try {
            b1 = Integer.parseInt(args[1]);
            b2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: lower and upper bounds must be integer numbers.");
            return;
        }

        if (b1 > b2) {
            System.out.println("Error: lower bound cannot be greater than upper bound.");
            return;
        }

        TaskOne.writeRandomNumbers(fileName, b1, b2);
        TaskTwo.readFile(fileName);
    }
}