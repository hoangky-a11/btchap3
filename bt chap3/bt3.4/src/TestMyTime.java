public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Initial time: " + time);


        time.nextSecond();
        System.out.println("After next second: " + time); // Expected 00:00:00


        time.nextMinute();
        System.out.println("After next minute: " + time); // Expected 00:01:00


        time.nextHour();
        System.out.println("After next hour: " + time); // Expected 01:01:00


        time.previousSecond();
        System.out.println("After previous second: " + time); // Expected 01:00:59

        time.previousMinute();
        System.out.println("After previous minute: " + time); // Expected 00:59:59


        time.previousHour();
        System.out.println("After previous hour: " + time); // Expected 23:59:59


        time.setTime(12, 30, 45);
        System.out.println("Updated time: " + time); // Expected 12:30:45
        System.out.println("Hour: " + time.getHour()); // Expected 12
        System.out.println("Minute: " + time.getMinute()); // Expected 30
        System.out.println("Second: " + time.getSecond()); // Expected 45
    }
}
