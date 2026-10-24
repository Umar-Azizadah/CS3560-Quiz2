public class DateChecker {
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER,
    }

    //January, March, May, July, August, October, and December
    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH,Month.MAY,
            Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }

        return switch (month) {
            case JANUARY, MARCH, MAY, JULY,
                 AUGUST, OCTOBER, DECEMBER -> true;

            // February and the 30-day months
            case FEBRUARY, APRIL, JUNE,
                 SEPTEMBER, NOVEMBER -> false;
        };
    }
}
