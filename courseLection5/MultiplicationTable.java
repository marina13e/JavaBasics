package courseLection5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите максимальный множитель таблицы умножения:");
        int maxNumber = scanner.nextInt();

        System.out.print("    ");

        for (int i = 1; i <= maxNumber; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.print("    ");

        for (int i = 0; i < maxNumber * 4; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 1; i <= maxNumber; i++) {
            System.out.printf("%3d|", i);

            for (int j = 1; j <= maxNumber; j++) {
                int number = i * j;
                System.out.printf("%4d", number);
            }

            System.out.println();
        }
    }
}
