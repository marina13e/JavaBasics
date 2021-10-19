package lection4;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название команды:");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введите строку для печати:");
                String inscription = scanner.nextLine();

                System.out.println(inscription);
                break;
            case "sum":
                System.out.println("Введите первое число:");
                double number1 = scanner.nextDouble();

                System.out.println("Введите второе число:");
                double number2 = scanner.nextDouble();

                double sum = number1 + number2;
                System.out.println("Сумма чисел = " + sum);
                break;
            default:
                System.out.println("Неизвестная комманда");
        }
    }
}

