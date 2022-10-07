package fibonacci_recursion;

import java.util.Scanner;


public class Main {
    // Fibonacci sequence starts with 0 1 and other is just sum of two previous
    // 0 1 1 2 3 5 8 13 21 34 55
    private static long[] fibonacciCache;

    // TODO : return number n in fibonacci sequence
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // return 6 (should be 8) -- user input
        // n + 1 (3 + 1 = 4) == needs to be 4 long[]
        fibonacciCache = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    private static long fibonacci(int n) {
        // BASE CASE
        if(n <= 1){
            return n;
        }
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n-2)); // get number on nth position
        fibonacciCache[n] = nthFibonacciNumber; // store the nthPosition in the cache
        return nthFibonacciNumber;
    }
}
