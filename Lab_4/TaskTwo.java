public class TaskTwo {
    public static void execute() {
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("1. while loop:");
        int i = 0;
        while (i < 10) { 
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("2. for loop:");
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.println("3. while loop (odd index):");
        int k = 1;
        while (k < 10) {
            System.out.print(arr[k] + " ");
            k = k + 2;
        }
        System.out.println();

        System.out.println("4. for loop (even index):");

        for (int m = 0; m < 10; m = m + 2) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();

        System.out.println("5. reverse order:");

        for (int n = 9; n >= 0; n--) {
            System.out.print(arr[n] + " ");
        }
        System.out.println();
    }
}