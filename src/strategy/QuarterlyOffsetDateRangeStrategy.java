package strategy;

import model.DataRange;

public class QuarterlyOffsetDateRangeStrategy implements DateRangeStrategy{
    @Override
    public void offset(DataRange dataRange) {
        dataRange.setOffsetForQuarterDateRange();
    }
}
