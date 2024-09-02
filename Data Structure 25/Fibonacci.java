public class Fibonacci {

    // Method to calculate Fibonacci number using recursion
    public int fibonacccirecursive(int n) {
        if (n < 0) {
            // Print message for invalid input (negative number) and return -1
            System.out.println("Fibonacci numbers are not defined for negative inputs.");
            return -1;
        } else if (n <= 1) {
            // Base case: If n is 0 or 1, return n
            return n;
        } else {
            // Recursive case: F(n) = F(n-1) + F(n-2)
            return fibonacccirecursive(n - 1) + fibonacccirecursive(n - 2);
        }
    }

    // Method to calculate Fibonacci number using iteration
    public int fibonacciiteration(int n) {
        if (n < 0) {
            // Print message for invalid input (negative number) and return -1
            System.out.println("Fibonacci numbers are not defined for negative inputs");
            return -1;
        } else if (n <= 1) {
            // Base case: If n is 0 or 1, return n
            return n;
        }

        // Variables to store previous and current Fibonacci numbers
        int prev = 0;
        int curr = 1;

        // Loop to calculate Fibonacci number iteratively
        for (int i = 2; i <= n; i++) {
            int next = prev + curr; // Calculate the next Fibonacci number
            prev = curr;            // Update previous number
            curr = next;            // Update current number
        }

        // Return the nth Fibonacci number
        return curr;
    }

    public static void main(String[] args) {
        // Create an object of the Fibonacci class
        Fibonacci fb = new Fibonacci();

        // Print Fibonacci series using recursion
        System.out.println("Fibonacci series with recursion");
        for (int i = 0; i <= 10; i++) {
            System.out.println("F(" + i + ") = " + fb.fibonacccirecursive(i));
        }

        // Print Fibonacci series using iteration
        System.out.println("Fibonacci series with iteration");
        for (int i = 0; i <= 10; i++) {
            System.out.println("F(" + i + ") = " + fb.fibonacciiteration(i));
        }
    }
}
