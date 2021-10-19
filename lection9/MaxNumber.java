package lection9;

public class MaxNumber {
    public static double getMaxNumber(double[] array) {
        double maxNumber = array[0];

        for (double e : array) {
            if (e > maxNumber) {
                maxNumber = e;
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        double[] array = {14, 28, 3, 16, 87, 4, 113, 21, -6, 18};
        double maxNumber = getMaxNumber(array);
        System.out.println("Максимальное число из массива = " + maxNumber);
    }
}
