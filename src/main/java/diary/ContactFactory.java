package diary;

public interface ContactFactory {
    Address createAddress(String street, String city, String postalCode);
    PhoneNumber createPhoneNumber(String number);
}
