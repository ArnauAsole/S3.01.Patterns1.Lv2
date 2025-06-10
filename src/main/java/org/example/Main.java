package org.example;

import diary.ContactFactory;
import diary.ContactManager;
import diary.USAcontactFactory;


public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        ContactFactory USAfactory = new USAcontactFactory();
        manager.addContact(USAfactory, "Calle Mayor 5", "Madrid", "28013", "600123456");

        manager.displayAllContacts();
    }
}