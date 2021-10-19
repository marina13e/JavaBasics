package lection6;

public class Expressions {
    public static double getExpressionResult(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static double getAverage(int startNumber, int endNumber) {
        int sum = 0;
        int numbersCount = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
            numbersCount++;
        }

        return (double) sum / numbersCount;
    }

    public static int getMaxNumber(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    public static int getMinNumber(int number1, int number2) {
        return (number2 < number1) ? number2 : number1;
    }

    public static void main(String[] args) {
        double x = 3.4;
        double y = 7;
        double expression = getExpressionResult(x, y);

        System.out.println("Значение выражения: " + expression);

        int startNumber = 13;
        int endNumber = 27;
        double average = getAverage(startNumber, endNumber);

        System.out.println("Среднее арифметическое: " + average);

        int number1 = 3;
        int number2 = 6;
        int maxNumber = getMaxNumber(number1, number2);
        int minNumber = getMinNumber(number1, number2);

        System.out.printf("Максимальное число: %d %nМинимальное число: %d", maxNumber, minNumber);
    }
}
