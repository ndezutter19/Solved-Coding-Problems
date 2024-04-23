//will calculate the factorial of a number n within reason

public class Factorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }
}
