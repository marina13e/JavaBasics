package courseLection4;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int fibonacciNumberIndex = scanner.nextInt();

        int fibonacciNumber = 0;

        if (fibonacciNumberIndex == 1) {
            fibonacciNumber = 1;
        } else {
            int prePreviousFibonacciNumber = 0;
            int previousFibonacciNumber = 1;

            for (int i = 2; i <= fibonacciNumberIndex; i++) {
                fibonacciNumber = prePreviousFibonacciNumber + previousFibonacciNumber;
                prePreviousFibonacciNumber = previousFibonacciNumber;
                previousFibonacciNumber = fibonacciNumber;
            }
        }

        System.out.printf("Число Фибоначчи с индексом %d = %d", fibonacciNumberIndex, fibonacciNumber);
    }
}
