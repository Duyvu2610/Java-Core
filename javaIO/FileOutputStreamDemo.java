package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String content = "Hello, World!";
        
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
