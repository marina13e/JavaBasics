package lection7;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона:");
        double from = scanner.nextDouble();

        System.out.println("Введите конец диапазона:");
        double to = scanner.nextDouble();

        Range range = new Range(from, to);

        range.print();
        System.out.println();

        System.out.println("Измените начало диапазона:");
        range.setFrom(scanner.nextDouble());

        System.out.println("Измените конец диапазона:");
        range.setTo(scanner.nextDouble());

        System.out.println("Начало диапазона = " + range.getFrom());
        System.out.println("Конец диапазона = " + range.getTo());

        Range range2 = new Range(0, 100);

        double rangeLength = range.getLength();
        System.out.println("Длина заданного диапазона: " + rangeLength);

        double range2Length = range2.getLength();
        System.out.println("Длина диапазона по умолчанию (от 0 до 100): " + range2Length);

        double rangeLengthDifferent = Math.abs(rangeLength - range2Length);
        System.out.println("Длина заданного диапазона отличается от длины диапазона по умолчанию на " + rangeLengthDifferent);

        System.out.println("Введите число для проверки на принадлежность заданному диапазону: ");
        double number = scanner.nextDouble();

        boolean isInside = range.isInside(number);

        if (isInside) {
            System.out.printf("Число %f входит в заданный диапазон", number);
        } else {
            System.out.printf("Число %f не входит в заданный диапазон", number);
        }
    }
}
