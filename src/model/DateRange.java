package model;

import lombok.Data;

@Data
public abstract class DateRange {
    public abstract void offset();
}
