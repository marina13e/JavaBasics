package lection7;

public class NameAndTelephoneNumber {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Игорь", "Колесников", "89513452243");
        contact1.print();

        System.out.println();
        contact1.setName("Николай");
        contact1.print();

        Contact contact2 = new Contact("Жанна", "Федоровна", "89087653372");
        contact2.print();
        contact2.setSurname("Савина");

        System.out.println();
        contact2.setTelephoneNumber("89089613575");
        contact2.print();
    }
}
