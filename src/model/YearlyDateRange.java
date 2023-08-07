package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class YearlyDateRange extends DateRange {
    private Date startDatetime;
    private int offsetValue;
    private Date endDatetime;

    @Override
    public void offset(){
        //
    }
}
