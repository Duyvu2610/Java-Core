package map;

import java.util.Hashtable;

public class MyHashTable {
	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable = new Hashtable<>();

        hashTable.put("Khóa 1", 10);
        hashTable.put("Khóa 2", 20);
        hashTable.put("Khóa 3", 30);

        int giaTri = hashTable.get("Khóa 1");
        System.out.println("Giá trị của Khóa 1 là: " + giaTri);

        for (String key : hashTable.keySet()) {
            int value = hashTable.get(key);
            System.out.println("Khóa: " + key + ", Giá trị: " + value);
        }
	}
}
