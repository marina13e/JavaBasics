package lection9;

public class SortCheck {
    public static boolean isSortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 7, 26, 30};

        boolean isAscendingArray = isSortedAscending(array);

        if (isAscendingArray) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив отсортирован не по возрастанию");
        }

        boolean isDescendingArray = isSortedDescending(array);

        if (isDescendingArray) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив отсортирован не по убыванию");
        }
    }
}
