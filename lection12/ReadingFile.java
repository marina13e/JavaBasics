package lection12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            int numbersCount = scanner.nextInt();

            double[] numbers = new double[numbersCount];

            for (int i = 0; i < numbersCount; i++) {
                numbers[i] = scanner.nextDouble();
            }

            System.out.println(Arrays.toString(numbers));
        }

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            double[] numbers = new double[10];

            int i = 0;

            while (scanner.hasNextDouble()) {
                if (i == numbers.length) {
                    double[] copy = new double[numbers.length * 2];

                    for (int j = 0; j < numbers.length; j++) {
                        copy[j] = numbers[j];
                    }

                    numbers = copy;
                }

                numbers[i] = scanner.nextDouble();
                i++;
            }

            double[] resultNumbers = new double[i];

            for (int j = 0; j < resultNumbers.length; j++) {
                resultNumbers[j] = numbers[j];
            }

            System.out.println(Arrays.toString(resultNumbers));
        }
    }
}
