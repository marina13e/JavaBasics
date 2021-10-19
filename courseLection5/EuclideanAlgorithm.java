package courseLection5;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGreatestCommonFactor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        int greatestCommonFactor;

        for (; ; ) {
            if (number1 % number2 == 0) {
                greatestCommonFactor = number2;
                break;
            }

            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }

        return greatestCommonFactor;
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
