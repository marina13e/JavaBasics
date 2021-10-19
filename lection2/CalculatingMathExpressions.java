package lection2;

public class CalculatingMathExpressions {
    public static void main(String[] args) {
        int x = 3 - (56 - 12) / 44 * (4 / 2);
        double y = (double) (2 * x) / (33 - x);
        double z = -x / (2 * y);

        System.out.println("Значение x = " + x);
        System.out.println("Значение y = " + y);
        System.out.println("Значение z = " + z);
    }
}
