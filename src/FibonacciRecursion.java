public class FibonacciRecursion {
    public static void main(String[] args) {
        int limit = 15;
        for (int i = 0; i < limit; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}