package map;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        int value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        boolean containsKey = map.containsKey("Four");
        System.out.println("Contains key 'Four': " + containsKey);
	}
}
