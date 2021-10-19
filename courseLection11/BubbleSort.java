package courseLection11;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean isUnchangedArray = true;

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isUnchangedArray = false;
                }
            }

            if (isUnchangedArray) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 13, 8, 27, 61, 54, 37};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
