import level.OffsetLevel;
import factory.DateRangeProcessor;
import model.DateRange;

import java.util.Date;

public class HandleDataRange {
    public void handleDataRange(String offsetLevel, Date startDatetime, int offsetValue, Date endDatetime, int filterLevel, String funcLevel, Date selectedDate, int startDateMonthAfterOffset) {
        DateRange dateRange = DateRangeProcessor.getDateRange(OffsetLevel.fromString(offsetLevel), startDatetime, offsetValue, endDatetime, filterLevel, funcLevel, selectedDate, startDateMonthAfterOffset);
        dateRange.offset();
    }
}