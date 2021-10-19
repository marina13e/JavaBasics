package lection9;

import java.util.Scanner;

public class MultiplicationTable {
    public static int[][] getMultiplicationTable(int linesCount, int columnsCount) {
        int[][] multiplicationTable = new int[linesCount][columnsCount];

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк в таблице:");
        int linesCount = scanner.nextInt();

        System.out.println("Введите количество столбцов в таблице:");
        int columnsCount = scanner.nextInt();

        int[][] multiplicationTable = getMultiplicationTable(linesCount, columnsCount);

        for (int[] string : multiplicationTable) {
            for (int column : string) {
                System.out.printf("%4d", column);
            }

            System.out.println();
        }
    }
}
