package courseLection11;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            sift(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            sift(array, i, 0);
        }
    }

    public static void sift(int[] array, int length, int i) {
        for (; ; ) {
            int maxChildIndex = i;
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;

            if (leftChildIndex < length && array[leftChildIndex] > array[maxChildIndex]) {
                maxChildIndex = leftChildIndex;
            }

            if (rightChildIndex < length && array[rightChildIndex] > array[maxChildIndex]) {
                maxChildIndex = rightChildIndex;
            }

            if (maxChildIndex == i) {
                break;
            }

            int temp = array[i];
            array[i] = array[maxChildIndex];
            array[maxChildIndex] = temp;
            i = maxChildIndex;
        }
    }

    public static void main(String[] args) {
        int[] array = {13, 4, 21, 18, 2, 17, 38, 6, 1};

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
