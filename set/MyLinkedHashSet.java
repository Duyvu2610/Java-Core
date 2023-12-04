package set;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java"); // Phần tử trùng lặp, sẽ bị bỏ qua

        System.out.println("LinkedHashSet: " + linkedHashSet);

        if (linkedHashSet.contains("Java")) {
            System.out.println("Java is in the LinkedHashSet");
        }

        linkedHashSet.remove("C++");

        System.out.println("LinkedHashSet after removing C++: " + linkedHashSet);

        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());

        linkedHashSet.clear();

        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
	}
}
