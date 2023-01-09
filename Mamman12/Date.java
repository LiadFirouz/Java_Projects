/**
 * This class represents a Date object
 * @version 03-12-22
 * @author Liad Firouz
 */
public class Date
{
    private static final int DAY_ONE = 1;
    private static final int DAY_TWENTY_EIGHT = 28;
    private static final int DAY_TWENTY_NINE =29;
    private static final int DAY_THIRTY = 30;
    private static final int DAY_THIRTY_ONE = 31;

    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    private static final int MIN_YEAR = 1000;
    private static final int MAX_YEAR = 9999;

    private static final int DEFAULT_DAY = 1;
    private static final int DEFAULT_MONTH = 1;
    private static final int DEFAULT_YEAR = 2000;

    private static final int HIGHEST_SINGLE_DIGIT = 9;

    private int _day;
    private int _month;
    private int _year;

    // Gets a date and check if it valid
    // @return true if this date is valid, otherwise false
    private boolean isValidDate(int day, int month, int year)
    {
        if(year >= MIN_YEAR && year <= MAX_YEAR)
        {
            //calculation for leap year - return true or false
            boolean leapYear = year % 4 == 0 && year % 100 == 0 && year % 400 == 0;

            if(month >= JANUARY && month <= DECEMBER)
            {
                //checks every month with his different possibility amount of days
                if (month == JANUARY || month == MARCH ||month == MAY ||month == JULY
                        || month == AUGUST || month == OCTOBER || month == DECEMBER)
                    if(day >= DAY_ONE && day <= DAY_THIRTY_ONE)
                        return true;

                if (month == APRIL || month == JUNE ||month == SEPTEMBER ||month == NOVEMBER)
                    if(day >= DAY_ONE && day <= DAY_THIRTY)
                        return true;

                if (month == FEBRUARY && leapYear)
                    if(day >= DAY_ONE && day <= DAY_TWENTY_NINE)
                        return true;

                if (month == FEBRUARY && !leapYear)
                    return day >= DAY_ONE && day <= DAY_TWENTY_EIGHT;
            }//if
        }//if

        return false;
    }

    /**
     * If the given date is valid - creates a new Date object, otherwise creates the date 1/1/2000
     *
     * @param day - the day in the month (1-31)
     * @param month - the month in the year (1-12)
     * @param year - the year (4 digits)
     */
    public Date(int day, int month, int year)
    {
        if(isValidDate(day, month, year))
        {
            _day = day;
            _month = month;
            _year = year;
        }//if

        //create a default date when date is invalid
        else
        {
            _day = DEFAULT_DAY;
            _month = DEFAULT_MONTH;
            _year = DEFAULT_YEAR;
        }//else
    }

    /**
     * Copy constructor
     * @param other - the date to be copied
     */
    public Date(Date other)
    {
        _day = other._day;
        _month = other._month;
        _year = other._year;
    }

    /**
     * Gets the day
     * @return the day
     */
    public int getDay()
    {
        return _day;
    }

    /**
     * Gets the month
     * @return the month
     */
    public int getMonth()
    {
        return _month;
    }

    /**
     * Gets the year
     * @return the year
     */
    public int getYear()
    {
        return _year;
    }


    /**
     * Set the day (only if date remains valid)
     * @param dayToSet - the day value to be set
     */
    public void setDay(int dayToSet)
    {
        if(isValidDate(dayToSet, _month, _year))
            _day = dayToSet;
    }


    /**
     * Set the month (only if date remains valid)
     * @param monthToSet - the month value to be set
     */
    public void setMonth(int monthToSet)
    {
        if(isValidDate(_day, monthToSet, _year))
            _month = monthToSet;
    }

    /**
     * Sets the year (only if date remains valid)
     * @param yearToSet - the year value to be set
     */
    public void setYear(int yearToSet)
    {
        if(isValidDate(_day, _month, yearToSet))
            _year = yearToSet;
    }

    /**
     * Check if 2 dates are the same
     * @param other - the date to compare this date to
     * @return true if the dates are the same, otherwise false
     */
    public boolean equals(Date other)
    {
        return _day == other._day && _month == other._month && _year == other._year;
    }

    /**
     * Check if this date is before other date
     * @param other - date to compare this date to
     * @return true if this date is before other date, otherwise false
     */
    public boolean before(Date other)
    {
        if(_year < other._year)
            return true;
        if(_month < other._month && _year == other._year)
            return true;
        return _day < other._day && _month == other._month && _year == other._year;
    }

    /**
     * Check if this date is after other date
     * @param other - date to compare this date to
     * @return true if this date is after other date, otherwise false
     */
    public boolean after(Date other)
    {
        return other.before(this);
    }

    // computes the day number since the beginning of the Christian counting of years
    // a given function
    private int calculateDate ( int day, int month, int year)
    {
        if (month < 3) {
            year--;
            month = month + 12;
        }
        return 365 * year + year/4 - year/100 + year/400 + ((month + 1) * 306)/10 + (day - 62);
    }

    /**
     * Calculates the difference in days between two dates
     * @param other - the date to calculate the difference between
     * @return the number of days between the dates (non-negative value)
     */
    public int difference(Date other)
    {
       return Math.abs(calculateDate(_day, _month, _year) - calculateDate(other._day, other._month, other._year));
    }

    /**
     * Returns a String that represents this date
     * @return String that represents this date in the following format:
     * day (2 digits) / month(2 digits) / year (4 digits) for example: 02/03/1998
     */
    public String toString()
    {
        String format = _day + "/";

        //adding a leading zero if needed to the days and months
        //with single digit
        if(_day <= HIGHEST_SINGLE_DIGIT)
            format = "0" + _day + "/";
        if(_month <= HIGHEST_SINGLE_DIGIT)
           return format + "0" + _month + "/" + _year;
        else
            return format + _month + "/" + _year;
    }

    /**
     * Calculate the date of tomorrow
     * @return the date of tomorrow
     */
    public Date tomorrow()
    {

        if(isValidDate(_day + 1, _month, _year))
            return new Date(_day + 1, _month, _year);

        else if (isValidDate(DEFAULT_DAY, _month + 1, _year))
            return new Date(DEFAULT_DAY, _month + 1, _year);

        return new Date(DEFAULT_DAY, DEFAULT_MONTH, _year + 1);

    }

}//Date class
