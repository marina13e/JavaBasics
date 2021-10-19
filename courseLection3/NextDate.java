package courseLection3;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        int daysInMonthCount;

        if (month == 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonthCount = 29;
        } else if (month == 2) {
            daysInMonthCount = 28;
        } else if ((month % 2 == 0 && month < 7) || (month % 2 != 0 && month > 8)) {
            daysInMonthCount = 30;
        } else {
            daysInMonthCount = 31;
        }

        if (day < 1 || year < 1 || month < 1 || month > 12 || day > daysInMonthCount) {
            System.out.println("Некорректная дата!");
        } else {
            if (day == 31 && month == 12) {
                day = 1;
                month = 1;
                year++;
            } else if (day == daysInMonthCount) {
                day = 1;
                month++;
            } else {
                day++;
            }

            System.out.printf("Следующая дата: %02d.%02d.%d", day, month, year);
        }
    }
}
