package lection7;

public class Contact {
    private String name;
    private String surname;
    private String telephoneNumber;

    public Contact(String name, String surname, String telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
    }

    public void print (){
        System.out.printf("%s %s %s", name, surname, telephoneNumber);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
