public class TaskFour {
    public static void taskFour() {
        System.out.println("Task 4. Maximum number from array");

        int[] numbers = {12, 45, -7, 68, 23, 100, 4};

        TaskThree.printArray(numbers);

        int maxNumber = getMaxFromArray(numbers);

        System.out.println("The largest number in the array: " + maxNumber);
    }

    public static int getMaxFromArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}