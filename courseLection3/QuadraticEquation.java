package courseLection3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение a:");
        double a = scanner.nextDouble();

        System.out.println("Введите значение b:");
        double b = scanner.nextDouble();

        System.out.println("Введите значение c:");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) <= epsilon) {
                if (Math.abs(c) <= epsilon) {
                    System.out.println("Уравнение имеет бесконечное множество решений (любое число является решением)");
                } else {
                    System.out.println("Уравнение не имеет решений");
                }
            } else {
                double x = -c / b;
                System.out.println("Ответ: x = " + x);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > epsilon) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.printf("Ответ: x1 = %f, x2 = %f", x1, x2);
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);

                System.out.println("Ответ: x = " + x);
            } else {
                System.out.println("Корней нет");
            }
        }
    }
}
