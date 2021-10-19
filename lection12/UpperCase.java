package lection12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("strings.txt"));
             PrintWriter writer = new PrintWriter("uppercaseString.txt")) {

            while (scanner.hasNextLine()) {
                writer.println((scanner.nextLine()).toUpperCase());
            }
        }
    }
}
