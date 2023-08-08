package model;

import level.OffsetLevel;
import lombok.Data;

import java.util.Date;

@Data
public abstract class DateRange {
    public abstract void offset();
}
