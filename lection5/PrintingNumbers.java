package lection5;

import java.util.Scanner;

public class PrintingNumbers {
    public static void main(String[] args) {
       /* for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 7; i <= 121; i++) {
            System.out.println(i);
        }

        for (int i = 100; i >= 30; i--) {
            System.out.println(i);
        }

        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int squaredNumber = (int) Math.pow(i, 2);
            System.out.println(squaredNumber);
        }

        System.out.println("Введите первое число:");
        int x = scanner.nextInt();

        System.out.println("Введите второе число:");
        int y = scanner.nextInt();

        int sum = 0;
        int numbersCount = 0;

        for (int i = x; i <= y; i++) {
            sum += i;
            numbersCount++;
        }
        double average = (double) sum / numbersCount;

        System.out.println("Среднее арифметическое чисел = " + average);*/

        for (int i = 0; i <= 100; i++) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println();

        int i = 0;

        while (i <= 100) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}
