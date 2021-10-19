package lection3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.printf("Наибольшее число = %d, Наименьшее число = %d", number1, number2);
        } else {
            System.out.printf("Наибольшее число = %d, Наименьшее число = %d", number2, number1);
        }

        System.out.println();

        int max = (number1 > number2) ? number1 : number2;
        int min = (number2 < number1) ? number2 : number1;

        System.out.printf("Наибольшее число = %d, Наименьшее число = %d", max, min);
    }
}
