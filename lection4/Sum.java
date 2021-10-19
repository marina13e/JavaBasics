package lection4;

public class Sum {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;

        while (x <= 9) {
            sum += x;
            x++;
        }

        System.out.println("Сумма чисел от 0 до 9 = " + sum);

        x = 3;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        while (x <= 21) {
            if (x % 2 == 0) {
                evenNumbersSum += x;
                evenNumbersCount++;
            }

            x++;
        }

        System.out.println("Сумма целых чисел от 3 до 21 = " + evenNumbersSum);
        System.out.println("Количество четных чисел от 3 до 21 = " + evenNumbersCount);
    }
}
