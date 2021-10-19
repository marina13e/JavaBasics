package courseLection3;

import java.util.Scanner;

public class QuadraticEquationWillDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение a:");
        double a = scanner.nextDouble();

        System.out.println("Введите значение b:");
        double b = scanner.nextDouble();

        System.out.println("Введите значение c:");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (a == 0) {
            double x = -c / b;
            boolean linearEquation = b * x + c <= epsilon;

            if (b == 0) {
                if (c == 0) {
                    System.out.println("Нулевое выражение");
                } else {
                    System.out.println("Неверное выражение");
                }
            }

            if (linearEquation) {
                System.out.println("Ответ: x = " + x);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                boolean quadraticEquationWithX1 = (a * Math.pow(x1, 2) + b * x1 + c) <= epsilon;
                boolean quadraticEquationWithX2 = (a * Math.pow(x2, 2) + b * x2 + c) <= epsilon;

                if (quadraticEquationWithX1 && quadraticEquationWithX2) {
                    System.out.printf("Ответ: x1 = %f, x2 = %f", x1, x2);
                }
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                boolean quadraticEquationWithX = (a * Math.pow(x, 2) + b * x + c) <= epsilon;

                if (quadraticEquationWithX) {
                    System.out.println("Ответ: x = " + x);
                }
            } else {
                System.out.println("Корней нет");
            }
        }
    }
}
