package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class DateRange {
    private Date startDatetime;
    private int offsetValue;
    private Date endDatetime;

    public abstract void offset();
}
