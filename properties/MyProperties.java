package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {
	public static void main(String[] args) {
        // Ghi cấu hình vào tệp tin
        writePropertiesToFile();

        // Đọc cấu hình từ tệp tin
        readPropertiesFromFile();
    }

    private static void writePropertiesToFile() {
        Properties properties = new Properties();
        try (FileOutputStream outputStream = new FileOutputStream("config.properties")) {
            properties.setProperty("database.url", "jdbc:mysql://localhost:3306/mydatabase");
            properties.setProperty("database.username", "user123");
            properties.setProperty("database.password", "password123");

            properties.store(outputStream, "Database Configuration");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readPropertiesFromFile() {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream("config.properties")) {
            properties.load(inputStream);

            String url = properties.getProperty("database.url", "defaultUrl");
            String username = properties.getProperty("database.username", "defaultUsername");
            String password = properties.getProperty("database.password", "defaultPassword");

            System.out.println("Database URL: " + url);
            System.out.println("Database Username: " + username);
            System.out.println("Database Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
