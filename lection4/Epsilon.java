package lection4;

import java.util.Scanner;

public class Epsilon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double x = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double y = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(x - y) <= epsilon) {
            System.out.println("Числа равны");
        }
    }
}
