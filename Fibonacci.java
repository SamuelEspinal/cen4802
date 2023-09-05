/**
 * A class that provides methods for calculating Fibonacci numbers.
 */
public class FibonacciCalculator {

    /**
     * Calculates the nth term in the Fibonacci sequence.
     *
     * @param n The position of the term to calculate (must be a positive integer).
     * @return The nth term in the Fibonacci sequence.
     * @throws IllegalArgumentException if n is not a positive integer.
     */
    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    /**
     * The main method to demonstrate the usage of the calculateFibonacci method.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        int n = 10;
        int nthFibonacci = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthFibonacci + ".");
    }
}
