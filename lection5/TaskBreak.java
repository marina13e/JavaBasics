package lection5;

import java.util.Scanner;

public class TaskBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hiddenString = "Хьюстон, у нас проблемы";

        while (true) {
            System.out.println("Введите стоку:");
            String enteredString = scanner.nextLine();

            if (enteredString.equals(hiddenString)) {
                System.out.println("Строки совпадают");
                break;
            }

            System.out.println("Строки не совпадают!");
        }
    }
}
