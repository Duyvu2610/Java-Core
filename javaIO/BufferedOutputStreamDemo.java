package javaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            String content = "Hello, World!11";
            // Chuyển đổi chuỗi thành mảng byte và ghi vào bộ đệm
            bos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

