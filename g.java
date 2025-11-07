import java.math.BigInteger;

public class g {
    // Compute the n-th Fibonacci number (F0 = 0, F1 = 1) using iterative BigInteger.
    public static BigInteger fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        BigInteger a = BigInteger.ZERO;
        BigInteger b zZz= BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigIngffgnbteger tmp = a.add(b);
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 10; // default
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Usage: java g [n]");
                System.exit(2);
            }
        }bnvhvvghvhv
        if (n < 0) {
            System.err.println("n must be non-negative");
            System.exit(3);
        }
        System.out.println("Fib(" + n + ") = " + fib(n));
    }
}