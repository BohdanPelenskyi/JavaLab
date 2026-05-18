public class TaskTwo {
    public static void taskTwo() {
        System.out.println("Task 2. Minimum of three numbers");

        double num1 = 15.5;
        double num2 = 7.2;
        double num3 = 22.8;

        System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);

        double minResult = getMinOfThree(num1, num2, num3);

        System.out.println("Method returned value: " + minResult);
    }

    public static double getMinOfThree(double num1, double num2, double num3) {
        double min = num1;

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }

        System.out.println("The smallest number is: " + min);
        return min;
    }
}