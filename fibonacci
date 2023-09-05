public class Fibonacci {

    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int nthFibonacci = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthFibonacci + ".");
    }
}
