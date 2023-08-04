package factory;

import Level.OffsetLevel;
import model.DailyDateRange;
import model.MonthlyDateRange;
import model.DateRange;
import model.QuarterlyDateRange;
import model.YearlyDateRange;

import java.util.Date;

public class DateRangeProcessor {

    public static DateRange getDateRange(OffsetLevel offsetLevel, Date startDatetime, int offsetValue, Date endDatetime, int filterLevel, String funcLevel, Date selectedDate, int startDateMonthAfterOffset) {
        switch (offsetLevel) {
            case YEARLY_OFFSET:
                return new YearlyDateRange(startDatetime, offsetValue, endDatetime);
            case QUARTERLY_OFFSET:
                return new QuarterlyDateRange(startDatetime, offsetValue, endDatetime, filterLevel, funcLevel, selectedDate);
            case MONTHLY_OFFSET:
                return new MonthlyDateRange(startDatetime, offsetValue, endDatetime, filterLevel, funcLevel, selectedDate, startDateMonthAfterOffset);
            case DAILY_OFFSET:
                return new DailyDateRange(startDatetime, offsetValue, endDatetime, filterLevel, funcLevel, selectedDate, startDateMonthAfterOffset);
            default:
                throw new IllegalArgumentException("Invalid offset level");
        }
    }

}
