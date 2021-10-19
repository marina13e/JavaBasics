package courseLection5;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        double depositSum = scanner.nextDouble();

        System.out.println("Введите % годовых:");
        double depositPercentage = scanner.nextDouble();

        System.out.println("Введите количество месяцев:");
        int monthsCount = scanner.nextInt();

        double totalSum = depositSum;
        final double percents = 100;
        final int monthsInYearCount = 12;

        for (int i = 0; i < monthsCount; i++) {
            totalSum += totalSum * (depositPercentage / percents / monthsInYearCount);
        }

        double profit = totalSum - depositSum;

        System.out.printf("Сумма вашего вклада после %d месяцев со ставкой %.2f%% равна %.2f%n" +
                "Прибыль составляет %.2f", monthsCount, depositPercentage, totalSum, profit);
    }
}
