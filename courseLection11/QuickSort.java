package courseLection11;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int x = array[left];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < x) {
                i++;
            }

            while (array[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (j > left) {
            quickSort(array, left, j);
        }

        if (i < right) {
            quickSort(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 17, 23, 5, 78, 1, 102, 8};
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);
        System.out.println(Arrays.toString(array));
    }
}
