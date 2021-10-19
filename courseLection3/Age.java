package courseLection3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст:");
        int age = scanner.nextInt();

        if (age > 112) {
            System.out.println("Вы слишком стары");
        } else if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age % 100 >= 11 && age % 100 <= 14) {
            System.out.printf("Вам %d лет", age);
        } else {
            int lastDigit = age % 10;

            if (lastDigit == 1) {
                System.out.printf("Вам %d год", age);
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                System.out.printf("Вам %d года", age);
            } else {
                System.out.printf("Вам %d лет", age);
            }
        }
    }
}
