package lection4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        int allDigitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = number % 10;

        while (number > 0) {
            int lastDigit = number % 10;
            allDigitsSum += lastDigit;

            if (lastDigit % 2 != 0) {
                oddDigitsSum += lastDigit;
            }

            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }

            number /= 10;
        }

        System.out.println("Сумма цифр в числе = " + allDigitsSum);
        System.out.println("Сумма нечетных цифр = " + oddDigitsSum);
        System.out.println("Наибольшая цифра = " + maxDigit);
    }
}
