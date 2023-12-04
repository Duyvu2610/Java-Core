package resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyResourceBundle {
	public static void main(String[] args) {
		Locale vietnamLocale = new Locale("vi");
		ResourceBundle messages_vn = ResourceBundle.getBundle("messages", vietnamLocale);

		Locale globalLocale = new Locale("en");
		ResourceBundle messages_en = ResourceBundle.getBundle("messages", globalLocale);

		// In các thông báo cho tiếng Viet
		System.out.println("VietNam Messages:");
		System.out.println("Greeting: " + messages_vn.getString("hello"));

		// In các thông báo cho tiếng Anh
		System.out.println("English Messages:");
		System.out.println("Greeting: " + messages_en.getString("hello"));
	}
}
