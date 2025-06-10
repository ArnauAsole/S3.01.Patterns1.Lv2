package diary;

public class USAddress implements Address {
    private final String street;
    private final String city;
    private final String postalCode;

    public USAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getFormattedAddress() {
        return street + ", " + city + ", " + postalCode + ", USA";
    }
}
