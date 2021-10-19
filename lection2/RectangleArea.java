package lection2;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника:");
        double length = scanner.nextDouble();

        System.out.println("Введите ширину прямоугольника:");
        double width = scanner.nextDouble();

        /* System.out.println("Площадь прямоугольника = " + length * width);
        System.out.println("Периметр прямоугольника = " + (length * 2 + width * 2)); */

        double rectangleArea = length * width;
        double rectanglePerimeter = length * 2 + width * 2;
        System.out.printf("Площадь = %f, Периметр = %f", rectangleArea, rectanglePerimeter);
    }
}
