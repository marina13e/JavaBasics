package lection9;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int e : array) {
            System.out.println(e);
        }
    }
}
