package lesson1;

public class Check {
    public static void main(String[] args) {
        System.out.println(factorial(3, 1));
    }

    public static int factorial(int n, int result) {
        if (n==0) {
            return result;
        }

        return factorial(n-1, result*n);
    }
}