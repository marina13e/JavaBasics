package lection2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 3;
        double y = 1.2;
        int z = 8;
        double a = y + x;
        double b = x % 2;
        double c = a * x;
        double d = b - y;
        int f = z / x;
        double e = d / y;
        double g = (double) z / x;
        System.out.println("Результат сложения = " + a);
        System.out.println("Остаток числа x = " + b);
        System.out.println("Результат умножения = " + c);
        System.out.println("Результат вычитания = " + d);
        System.out.println("Результат деления целых чисел = " + f);
        System.out.println("Результат деления вещественных чисел = " + e);
        System.out.println("Результат \"вещественного\" деления целых чисел = " + g);
    }
}
