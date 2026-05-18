public class TaskOne {
    public static void taskOne() {

        String phrase = "Hello World";
        for (int i = 1; i <= 50; i=i+1) {
            System.out.println(phrase);
        }

        System.out.println("______________________");

        int i = 1;

        while (i <= 50) {
            System.out.println(phrase);
            i++;
        }
    }
}