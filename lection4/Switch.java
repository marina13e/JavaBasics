package lection4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1:");
        int number1 = scanner.nextInt();

        System.out.println("Введите число 2:");
        int number2 = scanner.nextInt();

        System.out.println("Введите код команды:");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                int sum = number1 + number2;

                System.out.println("sum = " + sum);
                break;
            case 2:
                int subtraction = number1 - number2;

                System.out.println("subtraction = " + subtraction);
                break;
            case 3:
                int multiplication = number1 * number2;

                System.out.println("multiplication = " + multiplication);
                break;
            case 4:
                double division = (double) number1 / number2;

                System.out.println("division = " + division);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
