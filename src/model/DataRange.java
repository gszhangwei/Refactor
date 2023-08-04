package model;

import lombok.Data;

import java.util.Date;

import static Level.FilterLevel.DAYS;
import static Level.FilterLevel.MONTHS;
import static Level.FilterLevel.QUARTERS;

@Data
public class DataRange {
    private Date startDatetime;
    private Date endDatetime;
    private int offsetValue;
    private String filterLevel;
    private int funcLevel;
    private Date selectedDate;
    private int startDateMonthAfterOffset;

    public void setOffsetForYearDateRange() {
        startDatetime.setTime(startDatetime.getTime() + offsetValue);
        endDatetime.setTime(endDatetime.getTime() + offsetValue);
    }

    public void setOffsetForQuarterDateRange() {
        // setOffsetForQuarterDateRange
    }
    public void setOffsetForMonthlyDateRange() {
        // setOffsetForQuarterDateRange
    }

    private boolean isFilterLevelSmallerThanQuarterOffsetLevel(String filterLevel) {
        return QUARTERS.getValue().equals(filterLevel) || MONTHS.getValue().equals(filterLevel)
                || DAYS.getValue().equals(filterLevel);
    }
}
