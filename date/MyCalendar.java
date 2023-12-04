package date;

import java.util.Calendar;
import java.util.Date;

class MyCalendar {
	 public static void main(String[] args) {
	        // Lấy đối tượng Calendar hiện tại
	        Calendar calendar = Calendar.getInstance();

	        // Lấy thông tin ngày và thời gian hiện tại
	        int year = calendar.get(Calendar.YEAR);
	        int month = calendar.get(Calendar.MONTH) + 1; // Tháng bắt đầu từ 0
	        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
	        int hour = calendar.get(Calendar.HOUR_OF_DAY);
	        int minute = calendar.get(Calendar.MINUTE);
	        int second = calendar.get(Calendar.SECOND);

	        System.out.println("Current Date and Time:");
	        System.out.println("Year: " + year);
	        System.out.println("Month: " + month);
	        System.out.println("Day of Month: " + dayOfMonth);
	        System.out.println("Hour: " + hour);
	        System.out.println("Minute: " + minute);
	        System.out.println("Second: " + second);

	        // Lấy đối tượng Date từ Calendar
	        Date currentDate = calendar.getTime();
	        System.out.println("\nCurrent Date as Date object: " + currentDate);
	    }
}
