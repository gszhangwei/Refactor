import level.OffsetLevel;
import model.DateRange;

import java.util.Date;

public class HandleDataRange {
    public void handleDataRange(String offsetLevel, Date startDatetime, int offsetValue, Date endDatetime, int filterLevel, String funcLevel, Date selectedDate, int startDateMonthAfterOffset) {
        DateRange dateRange = DateRange.getDateRange(OffsetLevel.fromString(offsetLevel), startDatetime, offsetValue, endDatetime, filterLevel, funcLevel, selectedDate, startDateMonthAfterOffset);
        dateRange.offset();
    }
}