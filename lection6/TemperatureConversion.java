package lection6;

import java.util.Scanner;

public class TemperatureConversion {
    public static double convertToKelvin(double degreesCelsius) {
        return degreesCelsius + 273.15;
    }

    public static double convertToFahrenheit(double degreesCelsius) {
        return (degreesCelsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в градусах цельсия:");
        double degreesCelsius = scanner.nextDouble();

        double degreesKelvin = convertToKelvin(degreesCelsius);
        double degreesFahrenheit = convertToFahrenheit(degreesCelsius);
        System.out.printf("Температура в градусах Кельвина = %f K %nТемпература в градусах Фаренгейта = %f F", degreesKelvin, degreesFahrenheit);
    }
}
