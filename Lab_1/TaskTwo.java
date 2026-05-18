public class TaskTwo {
    public static void printSentence() {
        String w1 = "Mastering";
        String w2 = "the";
        String w3 = "modern";
        String w4 = "Java";
        String w5 = "language";
        String w6 = "gives";
        String w7 = "every";
        String w8 = "student";
        String w9 = "many";
        String w10 = "new";
        String w11 = "and";
        String w12 = "interesting";
        String w13 = "opportunities";

        String result = String.join(" ",
                w1, w2, w3, w4, w5, w6, w7,
                w8, w9, w10, w11, w12, w13
        );

        System.out.println(result);
    }
}