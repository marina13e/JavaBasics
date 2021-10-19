package lection4;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int lastNumber = scanner.nextInt();

        int i = 1;
        int expressionResult = 0;

        while (i <= lastNumber) {
            if (i % 2 == 0) {
                expressionResult -= (int) Math.pow(i, 2);
            } else {
                expressionResult += (int) Math.pow(i, 2);
            }

            i++;
        }

        System.out.println("Результат выражения = " + expressionResult);
    }
}
