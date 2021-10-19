package courseLection10;

public class BinarySearch {
    public static int binarySearch(int[] array, int number) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        for (; ; ) {
            if (leftIndex > rightIndex) {
                return -1;
            }

            int middleIndex = (leftIndex + rightIndex) / 2;

            if (number < array[middleIndex]) {
                rightIndex = middleIndex - 1;
            } else if (number > array[middleIndex]) {
                leftIndex = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }
    }

    public static int recursiveBinarySearch(int[] array, int number, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return -1;
        }

        int middleIndex = (leftIndex + rightIndex) / 2;

        if (number < array[middleIndex]) {
            return recursiveBinarySearch(array, number, leftIndex, middleIndex - 1);
        }

        if (number > array[middleIndex]) {
            return recursiveBinarySearch(array, number, middleIndex + 1, rightIndex);
        }

        return middleIndex;
    }

    public static void printIndex(int numberIndex) {
        if (numberIndex == -1) {
            System.out.println("Число не найдено");
        } else {
            System.out.println("Индекс числа = " + numberIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 12};
        int number = 7;

        int numberIndex1 = binarySearch(array, number);
        printIndex(numberIndex1);

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        int numberIndex2 = recursiveBinarySearch(array, number, leftIndex, rightIndex);
        printIndex(numberIndex2);
    }
}
