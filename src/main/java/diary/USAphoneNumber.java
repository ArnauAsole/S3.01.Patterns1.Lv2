package diary;

public class USAphoneNumber implements PhoneNumber {
    private final String number;

    public USAphoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String getFormattedNumber() {
        return "+1 " + number;
    }
}
