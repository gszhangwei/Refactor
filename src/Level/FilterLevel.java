package Level;

public enum FilterLevel {
    QUARTERS("quarters"),
    MONTHS("months"),
    DAYS("days");

    private final String value;

    FilterLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
