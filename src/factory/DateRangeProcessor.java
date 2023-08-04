package factory;

import Level.OffsetLevel;

import java.util.Date;

public class DateRangeProcessor {

    public void handleDateRange(OffsetLevel offsetLevel, Date startDatetime, int offsetValue, Date endDatetime, int filterLevel, int funcLevel, Date selectedDate, int startDateMonthAfterOffset) {
        switch (offsetLevel) {
            case YEARLY_OFFSET:
                handleYearlyOffsetDateRange(startDatetime, offsetValue, endDatetime);
                break;
            case QUARTERLY_OFFSET:
                handleQuarterlyOffsetDateRange(filterLevel, endDatetime, offsetValue, funcLevel, selectedDate, startDatetime);
                break;
            case MONTHLY_OFFSET:
                handleMonthlyOffsetDateRange(filterLevel, endDatetime, offsetValue, funcLevel, selectedDate, startDatetime, startDateMonthAfterOffset);
                break;
            case DAILY_OFFSET:
                handleDailyOffsetDateRange(filterLevel, endDatetime, offsetValue, funcLevel, selectedDate, startDatetime, startDateMonthAfterOffset);
                break;
            default:
                throw new IllegalArgumentException("Invalid offset level");
        }
    }

    private void handleYearlyOffsetDateRange(Date startDatetime, int offsetValue, Date endDatetime) {
        // setOffsetForMonthlyDateRange
    }

    public void handleQuarterlyOffsetDateRange(int filterLevel, Date endDatetime, int offsetValue, int funcLevel, Date selectedDate, Date startDatetime) {
        // setOffsetForYearDateRange
    }

    public void handleMonthlyOffsetDateRange(int filterLevel, Date endDatetime, int offsetValue, int funcLevel, Date selectedDate, Date startDatetime, int startDateMonthAfterOffset) {
        // setOffsetForQuarterDateRange
    }

    public void handleDailyOffsetDateRange(int filterLevel, Date endDatetime, int offsetValue, int funcLevel, Date selectedDate, Date startDatetime, int startDateMonthAfterOffset) {
        // setOffsetForQuarterDateRange
    }


}
