public class TaskSix {
    public static void taskSix() {
        System.out.println("Task 6. ExtendedProduct child class");

        ExtendedProduct extendedProduct = new ExtendedProduct();
        extendedProduct.input("Samsung Smartphone", 18000.0, 12, "Electronics", "Samsung");

        System.out.println("Extended product data before price reduction:");
        extendedProduct.printInfo();

        extendedProduct.reducePriceBy50();

        System.out.println("\nExtended product data after 50% price reduction:");
        extendedProduct.printInfo();
    }
}