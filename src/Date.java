public class Date {
    private int _day;
    private int _month;
    private int _year;
    private final int DEFAULT_DAY = 1;
    private final int DEFAULT_MONTH = 1;
    private final int DEFAULT_YEAR = 2000;
    private final int JAN = 1;
    private final int FEB = 2;
    private final int MAR = 3;
    private final int APR = 4;
    private final int MAY = 5;
    private final int JUN = 6;
    private final int JUL = 7;
    private final int AUG = 8;
    private final int SEP = 9;
    private final int OCT = 10;
    private final int NOV = 11;
    private final int DEC = 12;
    private final int DAYS_IN_LEAP = 29;
    private final int DAYS_IN_NON_LEAP = 28;
    private final int MAX_DAYS_IN_MONTH = 31;

    public Date(int day, int month, int year) {
        if (this.isValid(day, month, year)) {
            this._day = day;
            this._month = month;
            this._year = year;
        } else {
            this._day = 1;
            this._month = 1;
            this._year = 2000;
        }

    }

    public Date(Date other) {
        this._day = other._day;
        this._month = other._month;
        this._year = other._year;
    }

    public int getYear() {
        return this._year;
    }

    public int getMonth() {
        return this._month;
    }

    public int getDay() {
        return this._day;
    }

    public void setYear(int yearToSet) {
        if (this.isValid(this._day, this._month, yearToSet)) {
            this._year = yearToSet;
        }

    }

    public void setMonth(int monthToSet) {
        if (this.isValid(this._day, monthToSet, this._year)) {
            this._month = monthToSet;
        }

    }

    public void setDay(int dayToSet) {
        if (this.isValid(dayToSet, this._month, this._year)) {
            this._day = dayToSet;
        }

    }

    public boolean equals(Date other) {
        return this._day == other._day && this._month == other._month && this._year == other._year;
    }

    public boolean before(Date other) {
        return this._year < other._year || this._year == other._year && this._month < other._month || this._year == other._year && this._month == other._month && this._day < other._day;
    }

    public boolean after(Date other) {
        return other.before(this);
    }

    public int difference(Date other) {
        return Math.abs(this.calculateDate(this._day, this._month, this._year) - this.calculateDate(other._day, other._month, other._year));
    }

    public String toString() {
        String s = "";
        if (this._day < 10) {
            s = s + "0" + this._day + "/";
        } else {
            s = s + this._day + "/";
        }

        if (this._month < 10) {
            s = s + "0" + this._month + "/";
        } else {
            s = s + this._month + "/";
        }

        return s + this._year;
    }

    private boolean isValid(int d, int m, int y) {
        if (this.dayInRange(d) && this.monthInRange(m) && this.yearInRange(y)) {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return d <= 31;
                case 2:
                    return this.leap(y) && d <= 29 || !this.leap(y) && d <= 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return d <= 30;
                default:
                    return false;
            }
        } else {
            return false;
        }
    }

    private boolean dayInRange(int d) {
        return 1 <= d && d <= 31;
    }

    private boolean monthInRange(int m) {
        return 1 <= m && m <= 12;
    }

    private boolean yearInRange(int y) {
        return 1000 <= y && y < 10000;
    }

    private boolean leap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    private int calculateDate(int day, int month, int year) {
        if (month < 3) {
            --year;
            month += 12;
        }

        return 365 * year + year / 4 - year / 100 + year / 400 + (month + 1) * 306 / 10 + (day - 62);
    }

    private int calculateDateOption2(int day, int month, int year) {
        int y = year;
        int m = month;
        if (month < 3) {
            y = year - 1;
        }

        if (month < 3) {
            m = month + 12;
        }

        return (int)(Math.floor(365.25 * (double)y) - Math.floor((double)(y / 100)) + Math.floor((double)(y / 400)) + Math.floor(30.6 * (double)(m + 1)) + (double)day - 62.0);
    }

    public int dayInWeek() {
        int D = this._day;
        int M = this._month;
        int y = this._year;
        if (M < 3) {
            M += 12;
            --y;
        }

        int C = y / 100;
        int Y = y % 100;
        int whichDayInWeek = Math.floorMod(D + 26 * (M + 1) / 10 + Y + Y / 4 + C / 4 - 2 * C, 7);
        return whichDayInWeek;
    }

    public Date tomorrow() {
        if (this.isValid(this._day + 1, this._month, this._year)) {
            return new Date(this._day + 1, this._month, this._year);
        } else if (this.isValid(1, this._month + 1, this._year)) {
            return new Date(1, this._month + 1, this._year);
        } else {
            return this.isValid(1, 1, this._year + 1) ? new Date(1, 1, this._year + 1) : null;
        }
    }
}
