import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;


    public static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    };

    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };

    public static final int[] DAY_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };


    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDays = getMaxDaysInMonth(month, year);
        return day >= 1 && day <= maxDays;
    }


    private static int getMaxDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAY_IN_MONTHS[month - 1];
    }


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDayOfWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1; // Calendar uses 1 for Sunday, we need 0 for Sunday
    }


    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        int maxDays = getMaxDaysInMonth(month, year);
        if (day < 1 || day > maxDays) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    public String toString() {
        String dayOfWeek = DAYS[getDayOfWeek(year, month, day)];
        String monthName = MONTHS[month - 1];
        return dayOfWeek + " " + day + " " + monthName + " " + year;
    }


    public MyDate nextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.DATE, 1);
        return new MyDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
    }

    public MyDate nextMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.MONTH, 1);
        return new MyDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, Math.min(day, getMaxDaysInMonth(calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR))));
    }

    public MyDate nextYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.YEAR, 1);
        if (calendar.getActualMaximum(Calendar.DAY_OF_YEAR) < calendar.get(Calendar.DAY_OF_YEAR)) {
            throw new IllegalStateException("Year out of range!");
        }
        return new MyDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, Math.min(day, getMaxDaysInMonth(calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR))));
    }


    public MyDate previousDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.DATE, -1);
        return new MyDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
    }


    public MyDate previousMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.MONTH, -1);
        return new MyDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, Math.min(day, getMaxDaysInMonth(calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR))));
    }


    public MyDate previousYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.YEAR, -1);
        return new MyDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, Math.min(day, getMaxDaysInMonth(calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR))));
    }
}
