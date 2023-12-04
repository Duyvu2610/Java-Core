package date;

import java.util.Date;

public class MyDate {
	public static void main(String[] args) {
        Date currentDate = new Date();

        Date futureDate = new Date(currentDate.getTime() + 86400000); // Thêm 1 ngày (86400000 milliseconds)
        System.out.println("Future date? " + futureDate);

        Date pastDate = new Date(currentDate.getTime() - 86400000); // Bớt 1 ngày
        System.out.println("Past date? " + pastDate);

        Date clonedDate = (Date) currentDate.clone();
        System.out.println("Cloned Date: " + clonedDate);

        System.out.println("Comparison result: " + currentDate.compareTo(futureDate));

        System.out.println("Are the current date and future date equal? " + currentDate.equals(futureDate));

        long currentTimeInMillis = currentDate.getTime();
        System.out.println("Current Time in milliseconds: " + currentTimeInMillis);

        System.out.println("HashCode of current date: " + currentDate.hashCode());

        Date newDate = new Date();
        newDate.setTime(currentTimeInMillis);
        System.out.println("New Date after setting time: " + newDate);

        System.out.println("String representation of current date: " + currentDate.toString());
	}
}
