package model;

import lombok.Data;

import java.util.Date;

@Data
public class MonthlyDateRange extends DateRange {
    private int filterLevel;
    private String funcLevel;
    private Date selectedDate;
    private int startDateMonthAfterOffset;

    public MonthlyDateRange(Date startDatetime, int offsetValue, Date endDatetime, int filterLevel, String funcLevel, Date selectedDate, int startDateMonthAfterOffset) {
        super(startDatetime, offsetValue, endDatetime);
        this.filterLevel = filterLevel;
        this.funcLevel = funcLevel;
        this.selectedDate = selectedDate;
        this.startDateMonthAfterOffset = startDateMonthAfterOffset;
    }
    @Override
    public void offset() {

    }
}
