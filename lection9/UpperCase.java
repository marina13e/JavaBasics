package lection9;

import java.util.Arrays;

public class UpperCase {
    public static void convertStringsArrayToUpperCase(String[] stringsArray) {
        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = stringsArray[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] stringsArray = {"Привет!", "Как дела?", "Что делаешь?"};
        convertStringsArrayToUpperCase(stringsArray);
        System.out.println(Arrays.toString(stringsArray));
    }
}
