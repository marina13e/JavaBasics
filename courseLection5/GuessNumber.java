package courseLection5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int computerNumber = random.nextInt(100) + 1;
        int attemptsCount = 0;

        for (; ; ) {
            System.out.println("Введите целое число от 1 до 100:");
            int userNumber = scanner.nextInt();

            attemptsCount++;

            if (userNumber == computerNumber) {
                System.out.printf("Поздравляем! Вы угадали число с %d раза!", attemptsCount);
                break;
            }

            if (userNumber > computerNumber) {
                System.out.println("Ваше число больше загаданного числа!");
            } else {
                System.out.println("Ваше число меньше загаданного числа!");
            }

            System.out.println("К сожалению, вы не угадали число. Попробуйте еще раз.");
        }
    }
}
