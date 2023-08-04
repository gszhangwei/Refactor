package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class QuarterlyDateRange extends DateRange {
    private int filterLevel;
    private String funcLevel;
    private Date selectedDate;

    public QuarterlyDateRange(Date startDatetime, int offsetValue, Date endDatetime, int filterLevel, String funcLevel, Date selectedDate) {
        super(startDatetime, offsetValue, endDatetime);
        this.filterLevel = filterLevel;
        this.funcLevel = funcLevel;
        this.selectedDate = selectedDate;
    }

    @Override
    public void offset() {

    }
}
