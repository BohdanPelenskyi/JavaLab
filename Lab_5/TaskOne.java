public class TaskOne {
    public static void taskOne() {
        System.out.println("Task 1. Area of a right triangle");

        double leg1 = 5.0;
        double leg2 = 10.0;

        double area = getRightTriangleArea(leg1, leg2);

        System.out.println("First leg: " + leg1);
        System.out.println("Second leg: " + leg2);
        System.out.println("Area of the right triangle: " + area);
    }

    public static double getRightTriangleArea(double a, double b) {
        return (a * b) / 2;
    }
}