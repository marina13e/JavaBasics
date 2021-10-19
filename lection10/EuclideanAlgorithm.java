package lection10;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGreatestCommonFactor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        if (number1 % number2 == 0) {
            return number2;
        }

        return getGreatestCommonFactor(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Невозможно найти НОД!");
        } else {
            int greatestCommonFactor = getGreatestCommonFactor(number1, number2);
            System.out.println("Наибольший общий делитель = " + greatestCommonFactor);
        }
    }
}
