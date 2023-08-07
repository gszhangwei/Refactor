package strategy;

import model.DataRange;

public class YearlyOffsetDateRangeStrategy implements DateRangeStrategy{
    @Override
    public void offset(DataRange dataRange) {
        dataRange.setOffsetForYearDateRange();
    }
}
