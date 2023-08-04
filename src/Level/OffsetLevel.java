package Level;

public enum OffsetLevel {
    YEARLY_OFFSET("year"),
    QUARTERLY_OFFSET("quarter"),
    MONTHLY_OFFSET("month"),
    DAILY_OFFSET("day");

    private final String value;

    OffsetLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static OffsetLevel fromString(String value) {
        for (OffsetLevel offsetLevel : OffsetLevel.values()) {
            if (offsetLevel.value.equalsIgnoreCase(value)) {
                return offsetLevel;
            }
        }
        throw new IllegalArgumentException("Invalid unit: " + value);
    }

}
