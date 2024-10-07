public class TestMyDate {
    public static void main(String[] args) {
        // Test 1: Next day, next month, next year
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);             // Tuesday 28 Feb 2012
        System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
        System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
        System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(d1.nextYear());  // Monday 1 Apr 2013

        // Test 2: Previous day, previous month, previous year
        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);                 // Monday 2 Jan 2012
        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

        // Test 3: Handle leap year
        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());  // Monday 28 Feb 2011

        // Test 4: Invalid date handling
        try {
            MyDate d4 = new MyDate(2099, 11, 31);  // Invalid year, month, or day!
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Invalid year, month, or day!
        }

        try {
            MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Invalid year, month, or day!
        }

        // Test 5: Loop to print dates from 28 Dec 2011 to 2 Mar 2012
        MyDate loopDate = new MyDate(2011, 12, 28);
        for (int i = 0; i < 66; i++) {
            System.out.println(loopDate);
            loopDate = loopDate.nextDay();
        }
    }
}
