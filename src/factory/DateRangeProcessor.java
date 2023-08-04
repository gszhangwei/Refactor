package factory;

import Level.OffsetLevel;
import model.DailyOffsetDateRange;
import model.MonthlyOffsetDateRange;
import model.QuarterlyOffsetDateRange;
import model.YearlyOffsetDateRange;

import java.util.Date;

public class DateRangeProcessor {

    private YearlyOffsetDateRange yearlyOffsetDateRange = new YearlyOffsetDateRange();

    private QuarterlyOffsetDateRange quarterlyOffsetDateRange = new QuarterlyOffsetDateRange();

    private MonthlyOffsetDateRange monthlyOffsetDateRange = new MonthlyOffsetDateRange();

    private DailyOffsetDateRange dailyOffsetDateRange = new DailyOffsetDateRange();

    public void handleDateRange(OffsetLevel offsetLevel, Date startDatetime, int offsetValue, Date endDatetime, int filterLevel, int funcLevel, Date selectedDate, int startDateMonthAfterOffset) {
        switch (offsetLevel) {
            case YEARLY_OFFSET:
                yearlyOffsetDateRange.handleYearlyOffsetDateRange(startDatetime, offsetValue, endDatetime);
                break;
            case QUARTERLY_OFFSET:
                quarterlyOffsetDateRange.handleQuarterlyOffsetDateRange(filterLevel, endDatetime, offsetValue, funcLevel, selectedDate, startDatetime);
                break;
            case MONTHLY_OFFSET:
                monthlyOffsetDateRange.handleMonthlyOffsetDateRange(filterLevel, endDatetime, offsetValue, funcLevel, selectedDate, startDatetime, startDateMonthAfterOffset);
                break;
            case DAILY_OFFSET:
                dailyOffsetDateRange.handleDailyOffsetDateRange(filterLevel, endDatetime, offsetValue, funcLevel, selectedDate, startDatetime, startDateMonthAfterOffset);
                break;
            default:
                throw new IllegalArgumentException("Invalid offset level");
        }
    }


}
