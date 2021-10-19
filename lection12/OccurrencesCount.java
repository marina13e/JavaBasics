package lection12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesCount {
    public static int getOccurrencesCount(Scanner scanner, String searchString) {
        int occurrencesCount = 0;
        String lowerCaseSearchString = searchString.toLowerCase();

        while (scanner.hasNextLine()) {
            String lowerCaseString = scanner.nextLine().toLowerCase();

            int startIndex = 0;

            while (startIndex < lowerCaseString.length()) {
                int index = lowerCaseString.indexOf(lowerCaseSearchString, startIndex);

                if (index < 0) {
                    break;
                }

                occurrencesCount++;
                startIndex = index + lowerCaseSearchString.length();
            }
        }

        return occurrencesCount;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("text.txt"))) {
            String searchString = "Да, а может нет";

            int occurrencesCount = getOccurrencesCount(scanner, searchString);
            System.out.println("Число вхождений = " + occurrencesCount);
        }
    }
}
