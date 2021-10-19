package lection12;

import java.util.Arrays;

public class LineSplitting {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";
        String[] numberStrings = numbersLine.split(", ");

        int[] numbersArray = new int[numberStrings.length];
        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            int number = Integer.parseInt(numberStrings[i]);
            numbersArray[i] = number;
            sum += number;
        }

        System.out.printf("Массив из чисел: %s%nСумма чисел: %d", Arrays.toString(numbersArray), sum);
    }
}
