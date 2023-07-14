import java.util.Arrays;

public class FibbonacciNumber {
    public static void main(String[] args) {
        int num = 15;

        int[] fib = new int[num];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(Arrays.toString(fib));
    }

}
