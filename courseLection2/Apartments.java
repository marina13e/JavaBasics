package courseLection2;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int apartmentsPerFloorCount = 4;

        System.out.println("Введите количество подъездов в доме:");
        int entrancesCount = scanner.nextInt();

        System.out.println("Введите количество этажей в доме:");
        int floorsCount = scanner.nextInt();

        int allApartmentsInBuildingCount = entrancesCount * floorsCount * apartmentsPerFloorCount;
        int allApartmentsInEntranceCount = floorsCount * apartmentsPerFloorCount;
        System.out.println("Количество квартир в доме = " + allApartmentsInBuildingCount);
        System.out.println("Количество квартир в каждом подъезде = " + allApartmentsInEntranceCount);

        System.out.println("Введите номер квартиры:");
        int apartment = scanner.nextInt();

        if (apartment > allApartmentsInBuildingCount || apartment <= 0) {
            System.out.println("Квартиры с таким номером нет в доме");
        } else {
            int entranceNumber = (int) Math.ceil((double) apartment / allApartmentsInEntranceCount);
            System.out.println(entranceNumber + " подъезд");

            int floor = (int) Math.ceil(((double) apartment - allApartmentsInEntranceCount * (entranceNumber - 1)) / apartmentsPerFloorCount);
            System.out.println(floor + " этаж");

            int apartmentPosition = apartment % apartmentsPerFloorCount;

            if (apartmentPosition == 1) {
                System.out.println("Положение квартиры на этаже - ближняя слева");
            } else if (apartmentPosition == 2) {
                System.out.println("Положение квартиры на этаже - дальняя слева");
            } else if (apartmentPosition == 3) {
                System.out.println("Положение квартиры на этаже - дальняя справа");
            } else {
                System.out.println("Положение квартиры на этаже - ближняя справа");
            }
        }
    }
}
