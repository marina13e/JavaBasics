package lection11;

public class TaskMin {
    public static int getMinNumber(int[] array) {
        int minNumber = array[0];

        for (int e : array) {
            if (e < minNumber) {
                minNumber = e;
            }
        }

        return minNumber;
    }

    public static int getMinNumberIndex(int[] array) {
        return getMinNumberIndexFromStart(array, 0);
    }

    public static int getMinNumberIndexFromStart(int[] array, int startIndex) {
        int minNumberIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minNumberIndex]) {
                minNumberIndex = i;
            }
        }

        return minNumberIndex;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 3, 26, 7, 4};

        int minNumber = getMinNumber(array);
        System.out.println("Min number = " + minNumber);

        int minNumberIndex1 = getMinNumberIndex(array);
        System.out.println("Min Number Index = " + minNumberIndex1);

        int minNumberIndex2 = getMinNumberIndexFromStart(array, 3);
        System.out.println("Min Number Index = " + minNumberIndex2);
    }
}
