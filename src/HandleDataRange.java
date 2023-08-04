import Level.OffsetLevel;
import factory.DateRangeStrategyFactory;
import model.DataRange;
import strategy.DateRangeStrategy;

public class HandleDataRange {
    public void handleDataRange(DataRange dataRange, String offsetLevel) {
        DateRangeStrategy dateRangeStrategy = DateRangeStrategyFactory.getDateRangeStrategy(OffsetLevel.fromString(offsetLevel));
        dateRangeStrategy.handleDateRange(dataRange);
    }
}