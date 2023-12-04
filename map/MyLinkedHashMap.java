package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
	public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Khóa 1", 10);
        linkedHashMap.put("Khóa 2", 20);
        linkedHashMap.put("Khóa 3", 30);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Khóa: " + entry.getKey() + ", Giá trị: " + entry.getValue());
        }
    }
}
