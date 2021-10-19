package lection9;

import java.util.Scanner;

public class ItemSearch {
    public static int getIndex(int[] array, int requiredNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == requiredNumber) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {2, 6, 8, 31, 37, 23, 7, 62};

        System.out.println("Введите число:");
        int requiredNumber = scanner.nextInt();

        int index = getIndex(array, requiredNumber);

        if (index == -1) {
            System.out.println("Число не найдено");
        } else {
            System.out.println("Индекс числа = " + index);
        }
    }
}
