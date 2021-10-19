package lection10;

import java.util.Scanner;

public class Exponentiation {
    public static int getExponentiationWithoutRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        int result = number;

        for (int i = 2; i <= power; i++) {
            result *= number;
        }

        return result;
    }

    public static int getExponentiationWithRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return number * getExponentiationWithRecursion(number, power - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        System.out.println("Введите степень, в которую нужно возвести число:");
        int power = scanner.nextInt();

        int powerNumber1 = getExponentiationWithoutRecursion(number, power);
        System.out.printf("Число %d в степени %d = %d%n", number, power, powerNumber1);

        int powerNumber2 = getExponentiationWithRecursion(number, power);
        System.out.printf("Число %d в степени %d = %d", number, power, powerNumber2);
    }
}
