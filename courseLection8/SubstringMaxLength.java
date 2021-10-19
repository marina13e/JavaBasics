package courseLection8;

import java.util.Scanner;

public class SubstringMaxLength {
    public static int getSubstringMaxLength(String string) {
        string = string.toLowerCase();

        int substringLength = 1;
        int substringMaxLength = 0;

        if (string.length() == 1) {
            substringMaxLength = string.length();
        }

        for (int i = 1; i < string.length(); i++) {
            char symbol1 = string.charAt(i);
            char symbol2 = string.charAt(i - 1);

            if (symbol1 == symbol2) {
                substringLength++;
            } else {
                substringLength = 1;
            }

            if (substringLength > substringMaxLength) {
                substringMaxLength = substringLength;
            }
        }

        return substringMaxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String string = scanner.nextLine();

        int substringMaxLength = getSubstringMaxLength(string);
        System.out.println("Максимальная длина подстроки = " + substringMaxLength);
    }
}
