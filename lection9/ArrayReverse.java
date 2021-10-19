package lection9;

import java.util.Arrays;

public class ArrayReverse {
    public static void revertArray(int[] array) {
        int lastNumberIndex = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[lastNumberIndex];
            array[lastNumberIndex] = temp;
            lastNumberIndex--;
        }
    }

    public static void main(String[] args) {
        int[] array = {23, 4, 15, 16, 3, 122, 1};
        revertArray(array);
        System.out.println(Arrays.toString(array));
    }
}
