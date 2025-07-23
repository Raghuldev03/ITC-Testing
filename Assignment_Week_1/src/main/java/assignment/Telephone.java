package assignment;
import java.util.ArrayList;

class Contact {
    String name;
    String surname;
    String phoneNumber;
    String email;
    String place;

    public Contact(String name, String surname, String phoneNumber, String email, String place) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.place = place;
    }

    public void display() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Place: " + place);
        System.out.println("-----------------------------");
    }
}

public class Telephone{
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Raghul", "B", "9876543210", "Raghul@gmail.com", "Erode"));
        contacts.add(new Contact("Dev", "B", "9123456789", "Dev@example.com", "Chennai"));

        System.out.println("Telephone Directory:");
        for (Contact contact : contacts) {
            contact.display();
        }
    }
}
