package courseLection3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты первой точки по оси X:");
        double x1 = scanner.nextDouble();
        System.out.println("Введите координаты первой точки по оси Y:");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты второй точки по оси X:");
        double x2 = scanner.nextDouble();
        System.out.println("Введите координаты второй точки по оси Y:");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты третьей точки по оси X:");
        double x3 = scanner.nextDouble();
        System.out.println("Введите координаты третьей точки по оси Y:");
        double y3 = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs((x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1)) <= epsilon) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double side2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            double side3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

            double halfPerimeter = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));

            System.out.printf("Площадь треугольника = %.2f", area);
        }
    }
}
