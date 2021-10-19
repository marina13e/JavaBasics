package courseLection11;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            int j = i - 1;

            while (j >= 0) {
                if (temp >= array[j]) {
                    break;
                }

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {107, 18, 81, 13, 127, 10, 8, 4, 14, 2, 39};

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
