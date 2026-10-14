package String.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30_000);
        long finish = System.currentTimeMillis();
        System.out.println("Time spent for String: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        finish = System.currentTimeMillis();
        System.out.println("Time spent for StringBuilder: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        finish = System.currentTimeMillis();
        System.out.println("Time spent for StringBuffer: " + (finish - start) + " ms");
    }

    private static void concatString(int size) {
        String text = "";

        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);

        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
