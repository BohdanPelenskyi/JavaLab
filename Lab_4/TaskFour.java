public class TaskFour {
    public static void execute() {
        int[] arr = {15, -4, 7, 12, -9, 8, 21, 0, -3};

        System.out.println("Before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) { 
                arr[i] = arr[i] * (-1);
            }
        }

        System.out.println("After:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}