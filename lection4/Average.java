package lection4;

public class Average {
    public static void main(String[] args) {
        int startNumber = 21;
        int endNumber = 30;
        int i = startNumber;
        int allNumbersSum = 0;
        int allNumbersCount = 0;

        while (i <= endNumber) {
            allNumbersSum += i;
            allNumbersCount++;
            i++;
        }

        double average = (double) allNumbersSum / allNumbersCount;
        System.out.println("Среднее арифметическое чисел = " + average);

        int j = startNumber;
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        while (j <= endNumber) {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                evenNumbersCount++;
            }

            j++;
        }

        double averageEvenNumbers = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел = " + averageEvenNumbers);
    }
}
