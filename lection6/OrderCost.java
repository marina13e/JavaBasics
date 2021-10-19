package lection6;

import java.util.Scanner;

public class OrderCost {
    public static double getDiscount(int products1Count, double product1Cost, int products2Count, double product2Cost) {
        int minProductsCount = 10;
        double minOrderCost = 1000;
        double discountOnTwoConditions = 0.90;
        double discountOnOneCondition = 0.95;
        int allTypesProductsCount = products1Count + products2Count;
        double orderCost = products1Count * product1Cost + products2Count * product2Cost;

        if (allTypesProductsCount >= minProductsCount || orderCost >= minOrderCost) {
            if (allTypesProductsCount >= minProductsCount && orderCost >= minOrderCost) {
                return orderCost * discountOnTwoConditions;
            }

            return orderCost * discountOnOneCondition;
        }

        return orderCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость товара первого типа:");
        double product1Cost = scanner.nextDouble();
        System.out.println("Введите стоимость товара второго типа:");
        double product2Cost = scanner.nextDouble();

        System.out.println("Введите количество товаров первого типа:");
        int products1Count = scanner.nextInt();
        System.out.println("Введите количество товаров второго типа:");
        int products2Count = scanner.nextInt();

        double endOrderCost = getDiscount(products1Count, product1Cost, products2Count, product2Cost);
        System.out.println("Сумма к оплате составляет: " + endOrderCost);
    }
}
