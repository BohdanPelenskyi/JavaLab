public class TaskOne {
    public static void execute() {
        int[] arr = new int[100];
        int index = 0;

        for (int i = 2; i <= 100; i = i + 2) {
            arr[index] = i;
            index++;
        }

        for (int i = 1; i <= 99; i = i + 2) {
            arr[index] = i; 
            index++;        
        }

        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}