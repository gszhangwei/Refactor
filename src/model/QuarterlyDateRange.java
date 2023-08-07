package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class QuarterlyDateRange extends DateRange {
    private Date startDatetime;
    private int offsetValue;
    private Date endDatetime;
    private int filterLevel;
    private String funcLevel;
    private Date selectedDate;

    @Override
    public void offset() {

    }
}
