package courseLection11;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minNumberIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minNumberIndex]) {
                    minNumberIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minNumberIndex];
            array[minNumberIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 17, 1, 23, 5, 78, 1, 102};

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
