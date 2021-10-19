package lection4;

public class DoWhile {
    public static void main(String[] args) {
        int i = 21;
        int endNumber = 30;
        int allNumbersSum = 0;
        int allNumbersCount = 0;

        do {
            allNumbersSum += i;
            allNumbersCount++;
            i++;
        } while (i <= endNumber);

        double average = (double) allNumbersSum / allNumbersCount;
        System.out.println("Среднее арифметическое = " + average);

        int j = 21;
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        do {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                evenNumbersCount++;
            }

            j++;
        } while (j <= endNumber);

        double averageEvenNumbers = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел = " + averageEvenNumbers);
    }
}
