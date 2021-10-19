package lection12;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();

        int flatNumber = 121;
        int entranceNumber = 3;

        string.append("Номер квартиры = ")
                .append(flatNumber)
                .append(", номер подъезда = ")
                .append(entranceNumber);

        String result = string.toString();
        System.out.println(result);

        StringBuilder numbersLine = new StringBuilder();

        for (int i = 1; i <= 99; i++) {
            numbersLine.append(i)
                    .append(", ");
        }

        numbersLine.append(100);

        String numbersLineResult = numbersLine.toString();
        System.out.println(numbersLineResult);
    }
}
