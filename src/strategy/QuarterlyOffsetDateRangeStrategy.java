package strategy;

import model.DataRange;

public class QuarterlyOffsetDateRangeStrategy implements DateRangeStrategy{
    @Override
    public void handleDateRange(DataRange dataRange) {
        dataRange.setOffsetForQuarterDateRange();
    }
}
