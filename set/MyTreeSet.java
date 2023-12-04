package set;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        treeSet.add("Java"); // Phần tử trùng lặp, sẽ bị bỏ qua

        System.out.println("TreeSet: " + treeSet);

        if (treeSet.contains("Java")) {
            System.out.println("Java is in the TreeSet");
        }

        treeSet.remove("C++");

        System.out.println("TreeSet after removing C++: " + treeSet);

        System.out.println("Size of TreeSet: " + treeSet.size());

        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        treeSet.clear();

        System.out.println("TreeSet after clearing: " + treeSet);
	}
}
