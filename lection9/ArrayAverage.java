package lection9;

public class ArrayAverage {
    public static double getEvenNumbersAverage(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenNumbersSum += e;
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 9, 14, 23};

        double evenNumbersAverage = getEvenNumbersAverage(array);
        System.out.println("Среднее арифметическое четных чисел = " + evenNumbersAverage);
    }
}
