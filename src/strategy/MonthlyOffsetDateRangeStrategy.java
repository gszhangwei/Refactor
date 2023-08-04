package strategy;

import model.DataRange;

public class MonthlyOffsetDateRangeStrategy implements DateRangeStrategy{
    @Override
    public void handleDateRange(DataRange dataRange) {
        dataRange.setOffsetForMonthlyDateRange();
    }
}
