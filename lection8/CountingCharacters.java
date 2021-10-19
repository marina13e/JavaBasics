package lection8;

import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char stringCharacter = s.charAt(i);

            if (Character.isLetter(stringCharacter)) {
                lettersCount++;
            } else if (Character.isDigit(stringCharacter)) {
                digitsCount++;
            } else if (Character.isWhitespace(stringCharacter)) {
                whitespacesCount++;
            } else {
                otherSymbolsCount++;
            }
        }

        System.out.printf("Количество букв в строке - %d%nЦифр - %d%nПробелов - %d%nДругих символов - %d%n", lettersCount, digitsCount, whitespacesCount, otherSymbolsCount);
    }
}
