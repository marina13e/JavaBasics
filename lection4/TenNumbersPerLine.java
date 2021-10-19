package lection4;

import java.util.Scanner;

public class TenNumbersPerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while (i <= 100) {
            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.println();
            }

            i++;
        }

        System.out.println("Введите начальное число:");
        int startNumber = scanner.nextInt();

        System.out.println("Введите конечное число:");
        int endNumber = scanner.nextInt();

        System.out.println("Введите количество чисел выводимых в строке:");
        int numbersPerLineCount = scanner.nextInt();

        int printedNumbersCount = 0;
        int j = startNumber;

        while (j <= endNumber) {
            printedNumbersCount++;
            System.out.printf("%-10d ", j);

            if (printedNumbersCount % numbersPerLineCount == 0) {
                System.out.println();
            }

            j++;
        }
    }
}
