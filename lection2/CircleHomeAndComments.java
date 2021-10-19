package lection2;

/**
 * This is a test doc comment
 */
public class CircleHomeAndComments {
    public static void main(String[] args) {
        int radius1 = 5;
        double circleArea1 = Math.PI * Math.pow(radius1, 2);
        System.out.println("Площадь круга = " + circleArea1);
        double circumference1 = 2 * Math.PI * radius1;
        System.out.println("Длина окружности = " + circumference1); /* первое задание:
        найдена площадь круга и длина окружности */

        int circleArea2 = 7;
        double radius2 = Math.sqrt(circleArea2 / Math.PI);
        System.out.println("Радиус = " + radius2);

        int radius3 = 2;
        double degree3 = 30; //TODO: выполнить перевод в радианы
        double sectorAreaDegree3 = Math.PI * Math.pow(radius3, 2) * (degree3 / 360); // через градусы
        double sectorAreaRadians3 = Math.toRadians(degree3) / 2 * Math.pow(radius3, 2); // через радианы
        System.out.println("Площадь сектора (1 вариант) = " + sectorAreaDegree3);
        System.out.println("Площадь сектора (2 вариант) = " + sectorAreaRadians3);
    }
}
