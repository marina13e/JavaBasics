package lection1;

public class MathCalculation {
    public static void main(String[] args) {
        int x = 5;
        double y = -2.5;
        double g = x * 3 + x / y;
        int b = 36;
        double c = Math.sqrt(b);
        double a = g + c;
        System.out.println("Квадрат числа a равен " + Math.pow(a, 2));
    }
}
