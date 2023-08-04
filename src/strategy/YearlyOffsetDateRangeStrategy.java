package strategy;

import model.DataRange;

public class YearlyOffsetDateRangeStrategy implements DateRangeStrategy{
    @Override
    public void handleDateRange(DataRange dataRange) {
        dataRange.setOffsetForYearDateRange();
    }
}
