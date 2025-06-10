package diary;

public class USAcontactFactory implements ContactFactory {
    @Override
    public Address createAddress(String street, String city, String postalCode) {
        return new USAddress(street,city,postalCode);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new USAphoneNumber(number);
    }
}
