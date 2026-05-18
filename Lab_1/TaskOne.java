public class TaskOne {
    public static void calculateValues() {
        int x1 = 120;
        int x2 = 3;
        int x3 = 6;
        int x4 = 9;
        int x5 = 2;
        int x6 = 4;
        int x7 = 5;
        int x8 = 7;
        int x9 = 10;
        int x10 = 8;

        int totalSum = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10;
        int totalDiff = x1 - x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10;
        long totalProduct = (long) x1 * x2 * x3 * x4 * x5 * x6 * x7 * x8 * x9 * x10;
        int totalDivision = x1 / x2 / x3 / x4;

        System.out.println("Sum = " + totalSum);
        System.out.println("Difference = " + totalDiff);
        System.out.println("Product = " + totalProduct);
        System.out.println("Division = " + totalDivision);
    }
}