package set;

import java.util.HashSet;

public class MyHashSet {
	public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java"); // Phần tử trùng lặp, sẽ bị bỏ qua

        System.out.println("HashSet: " + hashSet);

        if (hashSet.contains("Java")) {
            System.out.println("Java is in the HashSet");
        }

        hashSet.remove("C++");

        System.out.println("HashSet after removing C++: " + hashSet);

        System.out.println("Size of HashSet: " + hashSet.size());

        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        hashSet.clear();

        System.out.println("HashSet after clearing: " + hashSet);
	}
}
