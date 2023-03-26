package recursion;

public class Recursion {
    int n = 4;

    int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
}
