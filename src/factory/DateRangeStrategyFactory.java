package factory;

import Level.OffsetLevel;
import strategy.DailyOffsetDateRangeStrategy;
import strategy.DateRangeStrategy;
import strategy.MonthlyOffsetDateRangeStrategy;
import strategy.QuarterlyOffsetDateRangeStrategy;
import strategy.YearlyOffsetDateRangeStrategy;

public class DateRangeStrategyFactory {
    public static DateRangeStrategy getDateRangeStrategy(OffsetLevel offsetLevel) {
        switch (offsetLevel) {
            case YEARLY_OFFSET:
                return new YearlyOffsetDateRangeStrategy();
            case QUARTERLY_OFFSET:
                return new QuarterlyOffsetDateRangeStrategy();
            case MONTHLY_OFFSET:
                return new MonthlyOffsetDateRangeStrategy();
            case DAILY_OFFSET:
                return new DailyOffsetDateRangeStrategy();
            default:
                throw new IllegalArgumentException("Invalid offset level");
        }
    }
}
