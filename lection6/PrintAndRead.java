package lection6;

import java.util.Scanner;

public class PrintAndRead {
    public static int printAndRead(String string) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(string);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int number1 = printAndRead("Введите первое число:");
        int number2 = printAndRead("Введите второе число:");

        System.out.printf("Первое число = %d %nВторое число = %d", number1, number2);
    }
}
