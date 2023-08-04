package model;

import lombok.Data;

import java.util.Date;

@Data
public class YearlyDateRange extends DateRange {

    public YearlyDateRange(Date startDatetime, int offsetValue, Date endDatetime) {
        super(startDatetime, offsetValue, endDatetime);
    }

    @Override
    public void offset(){
        //
    }
}
