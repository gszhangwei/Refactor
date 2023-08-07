package strategy;

import model.DataRange;

public class MonthlyOffsetDateRangeStrategy implements DateRangeStrategy{
    @Override
    public void offset(DataRange dataRange) {
        dataRange.setOffsetForMonthlyDateRange();
    }
}
