public class TaskThree {
    public static void taskThree() {
        System.out.println("Task 3. Print array");

        int[] numbers = {12, 45, -7, 68, 23, 100, 4};

        printArray(numbers);
    }

    public static void printArray(int[] array) {
        System.out.print("Array elements: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}