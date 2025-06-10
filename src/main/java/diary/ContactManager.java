package diary;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(ContactFactory factory, String street, String city, String postalCode, String phone) {
        Address address = factory.createAddress(street, city, postalCode);
        PhoneNumber phoneNumber = factory.createPhoneNumber(phone);
        Contact contact = new Contact(address, phoneNumber);
        contacts.add(contact);
    }

    public void displayAllContacts() {
        for (Contact contact : contacts) {
            contact.printContact();
            System.out.println("--------------------");
        }
    }
}