package diary;

public class Contact {
    private final Address address;
    private final PhoneNumber phoneNumber;

    public Contact(Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void printContact() {
        System.out.println("Address: " + address.getFormattedAddress());
        System.out.println("Phone: " + phoneNumber.getFormattedNumber());
    }
}
